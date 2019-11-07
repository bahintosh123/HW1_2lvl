package com.company;

public class Main {

    public static void main(String[] args) {

	Pet pet = new Pet("Charlie", 20);
	Cat cat = new Cat("Пуговка", 10);
	Cat cat2 = new Cat("Бусинка", 5);

	pet.lifeActivity();
	pet.lifeActivity(true, false); //при вызове метода называется аргумент
	pet.lifeActivity(true  );
	cat.lifeActivity(false);
	cat.lifeActivity(true,true);
	cat.lifeActivity();
	cat2.lifeActivity(false, true);
	cat2.lifeActivity(false);
	cat2.lifeActivity();
        System.out.println(pet.getAge() + " " + pet.getName());
        System.out.println(cat.getAge() + " " + cat.getName());
        System.out.println(cat2.getAge() + " " + cat2.getName());
    }

}
