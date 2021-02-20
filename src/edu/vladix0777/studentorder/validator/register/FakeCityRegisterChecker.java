package edu.vladix0777.studentorder.validator.register;

import edu.vladix0777.studentorder.domain.CityRegisterCheckerResponse;
import edu.vladix0777.studentorder.domain.Person;
import edu.vladix0777.studentorder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {
        return null;
    }
}
