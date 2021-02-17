package edu.vladix0777.studentorder.domain;

import javax.xml.crypto.Data;
import java.util.Date;

public class Adult extends Person{
    private String passportSeria;
    private String passportNumber;
    private Date issueDate;
    private String issueDepartment;
    private String university;
    private String studentId;

    public Adult() {
    }

    public Adult(String surName, String givenName, String patronymic, Data dateOrBirth) {
        super(surName, givenName, patronymic, dateOrBirth);
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getPassporSeria() {
        return passportSeria;
    }

    public void setPassporSeria(String passporSeria) {
        this.passportSeria = passporSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
