package com.example.persistence;

public class People {
    private String name;
    private int age;
    private String city;

    public People(String _name, int _age, String _city) {
        name=_name;
        age=_age;
        city=_city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
