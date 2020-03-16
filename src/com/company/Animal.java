package com.company;

public class Animal {
    private  Color color;
    private Zoo zoo;

    public Animal(Color color, Zoo zoo) {
        this.color = color;
        this.zoo = zoo;
    }

    public Animal() {
    }

    public Zoo getZoo() {
        return zoo;
    }

    public Color getColor() {
        return color;
    }
}

