package com.company;

public final class Cat extends Pet {


    public Cat(String name, int age) {
        super(name, age);
    }
    public void lifeActivity() {         //перезапись метода - когда не можем трогать метод родителя, но надо поменять его действие
        System.out.println("cat");
    }
}
