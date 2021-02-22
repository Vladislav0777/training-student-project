package edu.vladix0777.studentorder.validator.register;

import edu.vladix0777.studentorder.domain.Adult;
import edu.vladix0777.studentorder.domain.Child;
import edu.vladix0777.studentorder.domain.CityRegisterCheckerResponse;
import edu.vladix0777.studentorder.domain.Person;
import edu.vladix0777.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    private static final String GOOD = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR = "1002";
    private static final String ERROR_2 = "2002";

    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {

        CityRegisterCheckerResponse res = new CityRegisterCheckerResponse();

        if (person instanceof Adult) {
            Adult t = (Adult) person;
            String ps = t.getPassportNumber();
            if(ps.equals(GOOD)||ps.equals(GOOD_2)) {
                res.setExisting(true);
                res.setTemporal(false);
            }
            if(ps.equals(BAD)||ps.equals(BAD_2)) {
                res.setExisting(false);
            }
            if(ps.equals(ERROR)||ps.equals(ERROR_2)) {
                CityRegisterException ex = new CityRegisterException("Fake_error");
                throw ex;
            }
        }
        if(person instanceof Child) {
            res.setTemporal(true);
            res.setExisting(true);
        }
        System.out.println(res);
        return res;

    }
}
