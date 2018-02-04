package com.company;

public abstract class AnimalDomestico {
    String nombre;
    String color;

    public AnimalDomestico(String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    }

    //abstract -->
     abstract  public void saludar();
}
