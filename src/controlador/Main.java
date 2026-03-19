package controlador;

import modelo.personajes.Personaje;
import modelo.personajes.Enemigo;
import modelo.personajes.Lobezno;

public class Main {
    public static void main(String[] args) {

        Lobezno Lobezno = new Lobezno("Wolverine", 70, 80,5,"Garras Adamantium");
        Enemigo Ultron = new Enemigo("Ultron", 50, 12, 4, "Rayo láser");
        
        System.out.println(Lobezno);
        System.out.println("\n");
        System.out.println(Ultron);
        


    }
}