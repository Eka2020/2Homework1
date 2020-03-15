package com.company;

public class Main {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        System.out.println("Тигры");
        System.out.println(tiger.getFood("питаются мясом"));
        System.out.println(tiger.getSpeed("скорость 40км.ч"));
        System.out.println(Color.BROWN);
        System.out.println("_____________________________");
        Crocodile crocodile = new Crocodile("800кг", Color.GREEN, "5 метров");
        System.out.println("Crocodile");
        System.out.println(crocodile.getFood("питаются мясом"));
        System.out.println(crocodile.getSpeed("скорость 25км.ч"));
        System.out.println(crocodile.getLength("5 метров"));
        System.out.println(crocodile.getWeight("800кг"));
        System.out.println(Color.GREEN);

        System.out.println("_____________________________");
        Crocodile crocodile2 = new Crocodile(Color.GREEN, "1 тонна", "5 метров");
        System.out.println("Crocodile");
        System.out.println(crocodile2.getFood("питаются мясом"));
        System.out.println(crocodile2.getSpeed("скорость 29км.ч"));
        System.out.println(crocodile2.getLength("длина 5м"));
        System.out.println(crocodile2.getWeight("1000кг"));
        System.out.println(Color.GREEN);
        System.out.println("_____________________________");


    }
}
