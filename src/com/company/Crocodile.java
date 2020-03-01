package com.company;

final public class Crocodile extends Tiger {
    String weight;
    String length;

    public Crocodile(String weight, Color color, String length) {
        super(color);
        this.weight = weight;
        this.length = length;
    }

      public Crocodile(Color color, String weight, String length) {
        super(color);
        this.weight = weight;
        this.length = length;
    }


    private void getClasses() {
    }

    public String getWeight(String weight) {
        return weight;
    }

    public String getLength(String length) {
        return length;
    }

}
