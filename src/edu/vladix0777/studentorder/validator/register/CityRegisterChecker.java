package edu.vladix0777.studentorder.validator.register;

import edu.vladix0777.studentorder.domain.register.CityRegisterCheckerResponse;
import edu.vladix0777.studentorder.domain.Person;
import edu.vladix0777.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
