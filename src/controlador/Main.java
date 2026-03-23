package controlador;

import modelo.personajes.*;
import modelo.sistema.*;


public class Main {
    public static void main(String[] args) {
        A_Lobezno lobezno = new A_Lobezno();
        E_Magneto magneto = new E_Magneto();
        Combate combate = new Combate(lobezno, magneto);

        combate.iniciarCombate();

        
        System.out.println(lobezno);
        System.err.println("\n");
        System.out.println(magneto);

    }
}