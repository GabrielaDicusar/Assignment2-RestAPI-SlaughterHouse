package com.example.assignment2restapislaughterhouse.api.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    //The service should store  date,  weight,  registration  number  and  origin  (i.e.  farm)
    // of  the  animal.  It  should  be possible to read the details of a specific animal,
    // all animals arriving at a particular date, and all animals of a particular origin.

    private int weigth;
    private int regNumber;
    private String origin;
    private String dateOfReg;
    private String type;

    public Animal(int regNumber, String dateOfReg, String origin, int weigth , String type) {
        this.weigth = weigth;
        this.regNumber = regNumber;
        this.origin = origin;
        this.dateOfReg = dateOfReg;
        this.type = type;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(String dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "regNumber "+ regNumber  + "dateOfReg "+ dateOfReg +
                "origin " + origin + "weight" + weigth + "type" + type;
    }
}
