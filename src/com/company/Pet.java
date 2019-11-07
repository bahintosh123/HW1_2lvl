package com.company;

import java.awt.*;

public class Pet extends Animal {


    public Pet(String name, int age, COLOR color  ) {
        super( name, age, color );
    }

    public void lifeActivity(boolean herbivore){     // перегруженные методы(различие порядок, тип, количество)
         System.out.println(herbivore);
     }
     public final void lifeActivity(boolean carnivorous, boolean omnivorous){
         System.out.println(carnivorous + " " + omnivorous);
     }
    public void lifeActivity() {

    }

    }

