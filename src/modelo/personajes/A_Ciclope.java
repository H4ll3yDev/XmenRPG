package modelo.personajes;

import modelo.sistema.Personaje;

public class A_Ciclope extends Personaje {
    
        private String rayoLaser;

    public A_Ciclope(String nombre, int vida, String[] poderes, int ataque, int defensa, String habilidad, String rayoLaser, int vidaMaxima) {
        super(nombre, vida, poderes, ataque, defensa, habilidad, vidaMaxima);
        this.rayoLaser = rayoLaser;
    }
    
}
