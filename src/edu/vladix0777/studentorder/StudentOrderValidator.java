package edu.vladix0777.studentorder;

import edu.vladix0777.studentorder.domain.*;
import edu.vladix0777.studentorder.mail.MailSender;
import edu.vladix0777.studentorder.validator.ChildrenValidator;
import edu.vladix0777.studentorder.validator.CityRegisterValidator;
import edu.vladix0777.studentorder.validator.StudentValidator;
import edu.vladix0777.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();
            System.out.println("start");
            if(so == null){
                break;
            }
            System.out.println("finish");
            AnswerCityRegister citiAnswer = checkCityRegister(so);
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }
    static AnswerCityRegister checkCityRegister (StudentOrder so) {
        CityRegisterValidator citiRegVal = new CityRegisterValidator();
        citiRegVal.hostName = "host1";
        citiRegVal.login = "admin";
        citiRegVal.password = "111";
        AnswerCityRegister ansCit = citiRegVal.checkCityRegister(so);
        return ansCit;
    }
    static AnswerWedding checkWedding (StudentOrder so) {
        WeddingValidator wedVal = new WeddingValidator();
        return wedVal.checkWedding(so);
    }
    static AnswerChildren checkChildren (StudentOrder so) {
        ChildrenValidator childVal = new ChildrenValidator();
        return childVal.checkChildren(so);
    }
    static AnswerStudent checkStudent (StudentOrder so) {
        StudentValidator studentVal = new StudentValidator();
        return studentVal.checkStudent(so);
    }
    static void sendMail (StudentOrder so) {
        new MailSender().sendMail(so);
    }
}