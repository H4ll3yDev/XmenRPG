package modelo.personajes;

public class Lobezno extends Personaje{

public Lobezno(String nombre, int vida, int ataque, int defensa, String habilidad) {
        super(nombre, vida, ataque, defensa, habilidad);
    }

    @Override
    public void usarHabilidad(Personaje objetivo) {
        System.out.println(nombre + " usa habilidad!" + habilidad);


        objetivo.setVida(objetivo.getVida() - (ataque * 2));
    }
}