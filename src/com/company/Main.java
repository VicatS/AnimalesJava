package com.company;

public class Main {

    public static void main(String [] args) {

        // herencia Animal y borramos Perro-Gato
	    Perro p;
	    Gato g;
	    Veterinario veterinario;

	    p= new Perro("TOM", "marron");

        g= new Gato("Micifuz", "negro", "Angora");
        veterinario= new Veterinario(p);
        veterinario.curar();
        //g.saludar();--> saluda perro
        
    }
}
