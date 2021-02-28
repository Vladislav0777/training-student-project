package edu.vladix0777.studentorder;

import edu.vladix0777.studentorder.domain.*;
import edu.vladix0777.studentorder.domain.children.AnswerChildren;
import edu.vladix0777.studentorder.domain.register.AnswerCityRegister;
import edu.vladix0777.studentorder.domain.student.AnswerStudent;
import edu.vladix0777.studentorder.domain.wedding.AnswerWedding;
import edu.vladix0777.studentorder.mail.MailSender;
import edu.vladix0777.studentorder.validator.ChildrenValidator;
import edu.vladix0777.studentorder.validator.CityRegisterValidator;
import edu.vladix0777.studentorder.validator.StudentValidator;
import edu.vladix0777.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

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
        List<StudentOrder> soList = readStudentOrders();

        for (StudentOrder so : soList) {
            checkOneOrder(so);
        }
    }
    public List<StudentOrder> readStudentOrders() {
        List<StudentOrder> soList = new LinkedList<>();

        for (int i = 0; i<5; i++) {
            StudentOrder so = SaveStudentOrder.buildStudentOrder(i);
            soList.add(so);
        }

        return soList;
    }
    public void checkOneOrder(StudentOrder so){
        AnswerCityRegister citiAnswer = checkCityRegister(so);
 //       AnswerWedding wedAnswer = checkWedding(so);
 //       AnswerChildren childAnswer = checkChildren(so);
 //       AnswerStudent studentAnswer = checkStudent(so);

       sendMail(so);
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