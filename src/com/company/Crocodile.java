package com.company;

final public class Crocodile extends Tiger {
   private String weight;
   private String length;

    public Crocodile(String name, Color color, Zoo zoo, String food, String speed) {
        super(name, color, zoo, food, speed);
    }

    public Crocodile(String name, Color color, Zoo zoo, String food, String speed, String weight, String length) {
        super(name, color, zoo, food, speed);
        this.weight = weight;
        this.length = length;
    }

    public Crocodile(String name, String food, String speed, String weight, String length) {
        super(name, food, speed);
        this.weight = weight;
        this.length = length;
    }

    public Crocodile(String name, String food, String speed) {
        super(name, food, speed);
    }
    @Override
    public void printInfo() {
        System.out.println("Name animal: "+getName()+" Weight "+getWeight()+" length "+getLength());
    }
    public String getWeight() {
        return weight;
    }

    public String getLength() {
        return length;
    }
    @Override
    public String printVoice(int i, String voice) {
        return "Crocodile: "+super.printVoice(i, voice);
    }
}

