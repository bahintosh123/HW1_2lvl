package com.company;

public abstract class Animal {
    private String name;
    private int age;
    private enum COLOR {BLACK,WHITE,YELLOW};


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;



    }

    }





