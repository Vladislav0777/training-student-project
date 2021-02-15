package edu.vladix0777.studentorder.validator;

import edu.vladix0777.studentorder.domain.AnswerCityRegister;
import edu.vladix0777.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running:" + hostName +","+login+","+password);
        AnswerCityRegister ansReg = new AnswerCityRegister();
        return ansReg;
    }
}
