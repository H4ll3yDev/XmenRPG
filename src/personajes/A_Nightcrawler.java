package personajes;

import sistema.Personaje;
    
   public class A_Nightcrawler extends Personaje {

            private String teleport;

    public A_Nightcrawler(String nombre, int vida, String[] poderes, int ataque, int defensa, String habilidad, int vidaMaxima, String teleport) {
        super(nombre, vida, poderes, ataque, defensa, habilidad, vidaMaxima);
        this.teleport = teleport;
    }
    
}
