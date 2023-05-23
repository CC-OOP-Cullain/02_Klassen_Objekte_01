package com.cc.java;

public class App {
    
    public static void main(String[] args) {
      
        /* Instanziierung Klasse --> Objekt */
        Cat cat1 = new Cat("Grizabella", "white", 29);
    
        // Ausgabe über Methoden
        output(cat1.tellYourName());
        output(cat1.tellYourFurColor());
        output(Integer.toString(cat1.tellYourAge()));

        output("-------------------");

        Cat cat2 = new Cat("Alonzo","grey",35);
       
        // Ausgabe direkt
        output(cat2.name);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));




    }
 
    public static void output(String outStr) {
        System.out.println(outStr);
    }



}

