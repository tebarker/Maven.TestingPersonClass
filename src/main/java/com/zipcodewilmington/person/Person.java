package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String phoneNumber;
    private String ZwcCohort;
    private boolean scholarship;
    private String background;
    private int lockerNumber;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;

    }

    public Person(String name, int age, String phoneNumber, String ZwcCohort, boolean scholarship, String background, int lockerNumber) {
        this.name = name; // this.name from field = name from parameter.
        this.age= age;
        this.phoneNumber = phoneNumber; // this.phoneNumber from field you created = phoneNumber from parameter you just created.
        this.ZwcCohort = ZwcCohort;
        this.scholarship = scholarship;
        this.background = background;
        this.lockerNumber = lockerNumber;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;

    }
    public  void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public void setZwcCohort (String ZwcCohort){
        this.ZwcCohort = ZwcCohort;
    }
    public void setScholarship (Boolean scholarship){
        this.scholarship = scholarship;
    }

    public void setBackground (String background){
        this.background = background;
    }

    public void setLockerNumber (Integer LockerNumber){
        this.lockerNumber = LockerNumber;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getZwcCohort (){
        return this.ZwcCohort;
    }
    public Boolean getScholarship (){
        return this.scholarship;
    }

    public String getBackground ( ){
        return this.background;
    }

    public  Integer getLockerNumber ( ){
        return this.lockerNumber;
    }




    }

