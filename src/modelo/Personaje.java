package modelo;

public class Personaje {

    private String nombre;
    private int fuerza;
    private int vida;
    private int ataque;
    private int defensa;
    private String habilidad;
    
    public Personaje( String nombre, int vida, int ataque, int defensa, String habilidad) {
    this.nombre = nombre;
    this.vida = vida;
    this.ataque = ataque;
    this.defensa = defensa;
    this.habilidad = habilidad;

    } 

    public int getFuerza() {
        return fuerza;
    }
    
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public Personaje () {
        nombre= "Xavier";
        vida = 100;
        ataque = 50;
        defensa = 20;
        habilidad = "control mental";
    }
    
    public String toString () {
        return "\nTu personaje es: " + nombre + "\nvida: " + vida + "\nAtaque: " + ataque + "\nDefensa: " + defensa + "\nHabilidad: " + habilidad;
    }
    
    

/*public void ImprimirPersonaje (){
    String InfoPersonaje= "Has elegido a: " + nombre + "\nvida: " + vida + "\nataque" + ataque + "\ndefensa: " + defensa + "\nhabilidad" + habilidad;
    System.out.println(InfoPersonaje);
    }
*/
}
