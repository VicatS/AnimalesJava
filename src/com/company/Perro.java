package com.company;

public class Perro extends AnimalDomestico  { //extends=herencia

    // super --> llamar a padfe
    public Perro(String nombre, String color) {
        super(nombre,color);

    }

    public void saludar() {
        System.out.println("guauu");
    }
}
