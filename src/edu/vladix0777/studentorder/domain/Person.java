package edu.vladix0777.studentorder.domain;

import javax.xml.crypto.Data;

public abstract class Person {
    private String surName;
    private String givenName;
    private String patronymic;
    private Data dateOrBirth;

    public Person(String surName, String givenName, String patronymic, Data dateOrBirth) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.dateOrBirth = dateOrBirth;
    }

    public Person() {
        System.out.println("Person is created");
    }

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

    public Data getDateOrBirth() {
        return dateOrBirth;
    }

    public void setDateOrBirth(Data dateOrBirth) {
        this.dateOrBirth = dateOrBirth;
    }
}
