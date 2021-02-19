package edu.vladix0777.studentorder.validator;

import edu.vladix0777.studentorder.domain.CityRegisterCheckerResponse;
import edu.vladix0777.studentorder.domain.Person;
import edu.vladix0777.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
