package controlador;

import modelo.*;

public class Main {

    public static void main(String[] args) {

        Personaje pj1 = new Personaje();
        Personaje pj2 = new Personaje("Wolverine", 200, 80, 30, "Garras de adamantium");
        Personaje pj3 = new Personaje("Ciclope", 110, 30, 25, "Rayo laser");
        Personaje pj4 = new Personaje("Magneto",180, 90, 45, "Control del metal");
        Personaje pj5 = new Personaje("Mystica", 1300, 70, 30, "Cambia formas");

    }
}