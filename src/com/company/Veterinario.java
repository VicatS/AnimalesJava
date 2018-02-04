package com.company;

public class Veterinario {
    AnimalDomestico animalDomestico;

    public Veterinario(AnimalDomestico animalDomestico){
        this.animalDomestico=animalDomestico;
    }

    public void curar(){
        if (this.animalDomestico instanceof  Gato){
            System.out.println("Estoy curando un gato");
        }else{
            System.out.println("Se esta curando a un perro");
        }
        this.animalDomestico.saludar();
    }

}
