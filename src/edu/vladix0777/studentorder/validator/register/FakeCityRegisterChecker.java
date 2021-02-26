package edu.vladix0777.studentorder.validator.register;

import edu.vladix0777.studentorder.domain.Adult;
import edu.vladix0777.studentorder.domain.Child;
import edu.vladix0777.studentorder.domain.register.CityRegisterResponse;
import edu.vladix0777.studentorder.domain.Person;
import edu.vladix0777.studentorder.exception.CityRegisterException;
import edu.vladix0777.studentorder.exception.TransportException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    private static final String GOOD = "1000";
    private static final String GOOD_2 = "2000";
    private static final String BAD = "1001";
    private static final String BAD_2 = "2001";
    private static final String ERROR = "1002";
    private static final String ERROR_2 = "2002";
    private static final String ERROR_T = "1003";
    private static final String ERROR_T_2 = "2003";

    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException {

        CityRegisterResponse res = new CityRegisterResponse();

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
                CityRegisterException ex =
                        new CityRegisterException("1111", "GRN Fake_error" + ps);
                throw ex;
            }
            if(ps.equals(ERROR_T)||ps.equals(ERROR_T_2)) {
                TransportException ex =
                        new TransportException("Transpor Error" + ps);
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
