package edu.vladix0777.studentorder.validator;

import edu.vladix0777.studentorder.domain.AnswerCityRegister;
import edu.vladix0777.studentorder.domain.CityRegisterCheckerResponse;
import edu.vladix0777.studentorder.domain.StudentOrder;
import edu.vladix0777.studentorder.exception.CityRegisterException;

public class CityRegisterValidator {

    private String hostName;
    private String login;
    private String password;
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so)  {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson((so.getHusband()));
            CityRegisterCheckerResponse wans = personChecker.checkPerson((so.getWife()));
            CityRegisterCheckerResponse cans = personChecker.checkPerson((so.getChild()));
        } catch (CityRegisterException e) {
            e.printStackTrace();
        }


        AnswerCityRegister ansCityReg = new AnswerCityRegister();
        return ansCityReg;
    }
}
