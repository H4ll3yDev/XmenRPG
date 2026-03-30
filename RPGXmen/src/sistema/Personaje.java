package sistema;

public class Personaje {

	// ATRIBUTOS
	protected String nombre;
	protected int vida;
	protected String[] poderes;
	protected int ataque;
	protected int defensa;
	protected String habilidad;
	protected int vidaMaxima;
	protected boolean defendiendo = false;
	public int turnosInmovilizado = 0;
	protected int turnosAturdido = 0;

	public Personaje(String nombre, int vida, String[] poderes, int ataque, int defensa, String habilidad,
			int vidaMaxima) {
		this.nombre = nombre;
		this.vida = vida;
		this.poderes = poderes;
		this.ataque = ataque;
		this.defensa = defensa;
		this.habilidad = habilidad;
		this.vidaMaxima = vidaMaxima;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	// Metodo Atacar
	public void atacar(Personaje objetivo) {

    int danio = this.ataque;

    if (objetivo.defendiendo) {
        danio /= 2;
    }

    if (danio < 0) danio = 0;

    objetivo.setVida(objetivo.getVida() - danio);

    if (objetivo.getVida() < 0) {
        objetivo.setVida(0);
    }

    System.out.println(this.nombre + " ataca a " + objetivo.nombre +
            " causando " + danio + " de daño.");
}

	// Metodo defender
	public void defender() {
		this.defendiendo = true;
		System.out.println(this.nombre + " se está defendiendo y reduce el daño recibido.");
	}

	// Método opcional para resetear defensa (ej. turno siguiente)
	public void resetDefensa() {
		this.defendiendo = false;
	}

	// Metodo usar objeto
	public void usarObjeto(String objeto) {

		switch (objeto.toLowerCase()) {

			case "Gen X":
				this.vida += 20;
				System.out.println(this.nombre + " usa una poción y recupera 20 de vida.");
				break;

			case "objeto de ataque":
				this.ataque += 5;
				System.out.println(this.nombre + " usa un elixir y aumenta su ataque.");
				break;

			case "protección":
				this.defensa += 5;
				System.out.println(this.nombre + " usa un escudo y aumenta su defensa.");
				break;

			default:
				System.out.println("Objeto no válido.");
		}
	}

	public void efectoPasivo() {
    // vacío por defecto
}

	// USAR HABILIDAD
	public void usarHabilidad(Personaje enemigo) {
		System.out.println(this.nombre + " usa su habilidad: " + habilidad);

	}

	// Metodo curación
	public void curar(int cantidad) {
		vida += cantidad;

		if (vida > vidaMaxima) {
			vida = vidaMaxima;
		}
	}


	// Metodo revivir
	public void revivir(int vida) {
		if (!estaVivo()) {
			this.vida = vida;
		}
	}

	// ESTADO
	public boolean estaVivo() {
		return vida > 0;
	}

	public boolean puedeActuar() {
		return turnosInmovilizado == 0 && turnosAturdido == 0;
	}

	public void actualizarEstados() {
		if (turnosInmovilizado > 0)
			turnosInmovilizado--;
		if (turnosAturdido > 0)
			turnosAturdido--;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre +
				"\nVida: " + vida +
				"\nAtaque: " + ataque +
				"\nDefensa: " + defensa +
				"\nHabilidad: " + habilidad;
	}
}