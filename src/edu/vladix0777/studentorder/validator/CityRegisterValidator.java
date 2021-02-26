package edu.vladix0777.studentorder.validator;

import edu.vladix0777.studentorder.domain.Child;
import edu.vladix0777.studentorder.domain.Person;
import edu.vladix0777.studentorder.domain.register.AnswerCityRegister;
import edu.vladix0777.studentorder.domain.register.AnswerCityRegisterItem;
import edu.vladix0777.studentorder.domain.register.CityRegisterResponse;
import edu.vladix0777.studentorder.domain.StudentOrder;
import edu.vladix0777.studentorder.exception.CityRegisterException;
import edu.vladix0777.studentorder.exception.TransportException;
import edu.vladix0777.studentorder.validator.register.CityRegisterChecker;
import edu.vladix0777.studentorder.validator.register.FakeCityRegisterChecker;


public class CityRegisterValidator {

    public static final String IN_CODE = "NO_GRN";
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();

        ans.addItem(checkPerson((so.getHusband())));
        ans.addItem(checkPerson((so.getWife())));
        for (Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));
        }

        return ans;
    }

    private AnswerCityRegisterItem checkPerson (Person person) {
        AnswerCityRegisterItem.CityStatus status = null;
        AnswerCityRegisterItem.CityError error = null;

        try {
            CityRegisterResponse tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ?
                    AnswerCityRegisterItem.CityStatus.YES :
                    AnswerCityRegisterItem.CityStatus.NO;
        } catch (CityRegisterException e) {
            e.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(e.getCode(), e.getMessage());
        } catch (TransportException e) {
            e.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, e.getMessage());
        }

        AnswerCityRegisterItem ans =
                new AnswerCityRegisterItem(status, person, error);
        return null;
    }
}
