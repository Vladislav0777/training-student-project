package edu.vladix0777.studentorder.domain;

public class Person {
    private String surName;
    private String givenName;
    private String patronymic;
    private String dateOrBirth;

    public String getPersonString() {
        return surName + " " + givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOrBirth() {
        return dateOrBirth;
    }

    public void setDateOrBirth(String dateOrBirth) {
        this.dateOrBirth = dateOrBirth;
    }
}
