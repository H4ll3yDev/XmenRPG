package sistema;

import sistema.Personaje;

public class Enemigo extends Personaje {

    public Enemigo(String nombre, int vida, String[] poderes, int ataque, int defensa, String habilidad, int vidaMaxima) {
        super(nombre, vida, poderes, ataque, defensa, habilidad, vidaMaxima);
    }

@Override
public void usarHabilidad(Personaje objetivo) {
    System.out.println(getNombre() + " usa una habilidad de enemigo.");
}
}

