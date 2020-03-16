package com.company;

public class Tiger extends Animal {
    private String name;
    private String food;
    private String speed;

    public Tiger(String name,Color color, Zoo zoo,  String food, String speed) {
        super(color, zoo);
        this.name = name;
        this.food = food;
        this.speed = speed;
    }

    public Tiger(String name, String food, String speed) {
        this.name = name;
        this.food = food;
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println("Name animal: "+name+" name zoo " + getZoo().getName() + " address " + getZoo().getAddress() + " Skorost " + getSpeed() + " food " + getFood());
    }

    public final void printVoice(String voice, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(voice);
        }
    }

    public String printVoice(int i, String voice) {
        for (int j = 0; j < i; j++) {
            System.out.println(voice);
        }
        return voice;
    }

    public String getFood() {
        return food;
    }

    public String getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}


