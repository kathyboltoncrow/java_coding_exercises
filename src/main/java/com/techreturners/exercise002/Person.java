package com.techreturners.exercise002;

public class Person {
    private String firstname;
    private String surname;
    private String city;
    private int age;

    public Person(String firstname, String surname, String city, int age) {
        this.firstname = firstname;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getSurname() {
        return surname;
    }
    public String getCity() {
        return city;
    }
    public int getAge() {
        return age;
    }
}
