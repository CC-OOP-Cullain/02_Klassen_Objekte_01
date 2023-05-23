package com.cc.java;

public class App {
    
    public static void main(String[] args) {
      
        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable
        
        Cat cat1 = new Cat();
        
        // Wertzuweisung
        cat1.name = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;

        // Ausgabe über Methoden
        output(cat1.name);
        output(cat1.furColor);
        output(Integer.toString(cat1.age));

        // App.output("hi");
        output("-------------------");

        Cat cat2 = new Cat();
       
        // Wertzuweisung
        cat2.name = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;

        // Ausgabe direkt
        output(cat2.name);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));




    }
 
    public static void output(String outStr) {
        System.out.println(outStr);
    }



}

