package com.company;

public class Main {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Tiger", Color.BROWN, new Zoo(" Africa ", " OrganizeTG "), "мясо", "5км.ч");
        Crocodile crocodile = new Crocodile(" Crocodile ", " мясо ", " 7 ","305","100");
        Tiger tiger1 = new Tiger("Wight Tiger", Color.BROWN, new Zoo(" America ", " DeoTih "), "мясо", "5км.ч");
        tiger.printInfo();
        crocodile.printInfo();
        tiger1.printInfo();
        tiger.printVoice(3, " rrrrr ");
        crocodile.printVoice(4, " brr ");
        tiger1.printVoice(" rrrrr ", 5);


    }
}
