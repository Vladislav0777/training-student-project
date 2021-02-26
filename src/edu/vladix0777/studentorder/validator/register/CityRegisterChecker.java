package edu.vladix0777.studentorder.validator.register;

import edu.vladix0777.studentorder.domain.register.CityRegisterResponse;
import edu.vladix0777.studentorder.domain.Person;
import edu.vladix0777.studentorder.exception.CityRegisterException;
import edu.vladix0777.studentorder.exception.TransportException;

public interface CityRegisterChecker
{
    CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException;
}
