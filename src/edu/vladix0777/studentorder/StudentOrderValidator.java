package edu.vladix0777.studentorder;

import edu.vladix0777.studentorder.domain.*;
import edu.vladix0777.studentorder.mail.MailSender;
import edu.vladix0777.studentorder.validator.ChildrenValidator;
import edu.vladix0777.studentorder.validator.CityRegisterValidator;
import edu.vladix0777.studentorder.validator.StudentValidator;
import edu.vladix0777.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator () {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOderVal = new StudentOrderValidator();
        studentOderVal.checkAll();
    }
    public void checkAll() {

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

    public StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }
    public AnswerCityRegister checkCityRegister (StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }
    public AnswerWedding checkWedding (StudentOrder so) {
        return weddingValidator.checkWedding(so);
    }
    public AnswerChildren checkChildren (StudentOrder so) {
        return childrenValidator.checkChildren(so);
    }
    public AnswerStudent checkStudent (StudentOrder so) {
        return studentValidator.checkStudent(so);
    }
    public void sendMail (StudentOrder so) {
        mailSender.sendMail(so);
    }
}