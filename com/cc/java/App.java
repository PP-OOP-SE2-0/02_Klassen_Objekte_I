package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /** Typkonvertierung  */
        // App.output(String.valueOf(2));  // int --> String
        // App.output(Integer.toString(2));  // int --> String
        // App.output("Das ist eine Ziffer: " + 2);  // int --> String

        output("------------------------");
        
        // neues Objekt wird erzeugt, Adresse wird cat zugewiesen

    Cat cat = new Cat("Grizabella", "white", 29);
   
    

    // output(cat.name);
    // output(cat.furColor);
    // output(String.valueOf(cat.age));


    output(cat.getName());
    output(cat.getFurColor());
    output(String.valueOf(cat.getAge()));

    output("------------------------");

    Cat cat1 = new Cat("Alonzo", "grey", 35);

    cat1.changeName("Test");



    output(cat1.getName());
    output(cat1.getFurColor());
    output(String.valueOf(cat1.getAge()));
   
   
    // Cat cat1 = new Cat();
    // cat1.name = "Alonzo";
    // cat1.furColor = "grey";
    // cat1.age = 35;

    // output(cat1.tellYourName());
    // output(cat1.tellYourFurColor());
    // output(String.valueOf(cat1.tellYourAge()));





        // Methode output befindet sich in der KLASSE App
        // App.output("Blick von aussen: "+ cat); 
        // Methode tellYourAddress() befindet sich im OBJEKT cat 
        // cat.tellYourAddress();
    
        output("------------------------");

        // neues Objekt wird erzeugt, Adresse wird cat1 zugewiesen
        // Methode output befindet sich in der KLASSE App
        // output("Blick von aussen: "+ cat1); 
        // Methode tellYourAddress() befindet sich im OBJEKT cat1 
        // cat1.tellYourAddress();

    }

    // Methode witrd aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

