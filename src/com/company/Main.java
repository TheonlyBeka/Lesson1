package com.company;

public class Main {

    public static void main(String[] arg) {
        Shelter shelter = new Shelter("Best Friends", "Panfilova 10");
        Dog shepherd = new Dog("Muhtar", "shepherd", new String[]{"Sit","Attack"}, ColorEnum.BLACK, shelter);
        shepherd.makeVoice("Гав-гав", 1);
        System.out.println(shepherd.getInfo());
        System.out.println("________________________________");
        Dog bulldog = new Dog("Saitama", "bulldog", ColorEnum.BROWN, shelter);
        bulldog.makeVoice("Гав-гав");
        System.out.println(bulldog.getInfo());
        System.out.println("________________________________");
        Dog dachshund = new Dog("Sausage", "dachshund", new String[]{"Lie", "Voice"});
        dachshund.makeVoice("Гав-гав",3);
        System.out.println(dachshund.getInfo());
    }
}
