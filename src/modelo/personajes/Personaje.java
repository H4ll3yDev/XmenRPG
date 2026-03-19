package modelo.personajes;

public abstract class Personaje {

	// ATRIBUTOS
	protected String nombre;
	protected int vida;
	protected int ataque;
	protected int defensa;
	protected String habilidad;

	public Personaje(String nombre, int vida, int ataque, int defensa, String habilidad) {

		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.habilidad = habilidad;

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

	//Metodos

	//Atacar
	public void atacar(Personaje objetivo) {
    objetivo.vida -= this.ataque; //Resta vida segun el ataque
    if(objetivo.vida < 0) objetivo.vida = 0; //Evitamos vida negativa
    System.out.println(this.nombre + " ataca a " + objetivo.nombre + " causando " + this.ataque + " de daño.");
	
	}

	//Comprobar estado personaje
	 public boolean estaVivo() {
        return vida > 0;
    }

	//Uso de Habilidad
	public abstract void usarHabilidad(Personaje objetivo);

	@Override
	public String toString() {
    return "Nombre: " + nombre +
           "\nVida: " + vida +
           "\nAtaque: " + ataque +
           "\nDefensa: " + defensa +
           "\nHabilidad: " + habilidad;
}
}

