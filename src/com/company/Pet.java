package com.company;

import java.util.Arrays;
import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ColorEnum color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo() {
        if (shelter != null) {
            return "Age " + age +
                    "\nColor " + color +
                    "\nShelter name: " + shelter.getName() +
                    "\nShelter address: " + shelter.getAddress();
        } else {
            return "Age " + age +
                    "\nColor " + color;
        }
    }
}
