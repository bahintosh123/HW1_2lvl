package com.company;

import java.awt.*;

public  class Animal {
    public COLOR getColor() {
        return color;
    }

    private String name;
    private int age;
    enum COLOR {BLACK,WHITE,YELLOW};
    COLOR color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age, COLOR color) {
        this.name = name;
        this.age = age;
        this.color=color;



    }

    }





