package modelo.personajes;

public class Enemigo extends Personaje {

    public Enemigo(String nombre, int vida, int ataque, int defensa, String habilidad) {
        super(nombre, vida, ataque, defensa, habilidad);
    }

    @Override
    public void usarHabilidad(Personaje objetivo) {
        System.out.println(nombre + " usa su habilidad: " + habilidad);

        // Ejemplo: daño extra
        objetivo.setVida(objetivo.getVida() - (ataque + 5));
    }
}