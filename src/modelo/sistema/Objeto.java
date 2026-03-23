package modelo.sistema;

public class Objeto {

    private String nombre;
    private String tipo;
    private int valor;

    public Objeto(String nombre, String tipo, int valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }


    //Metodo uso
    public void usar(Personaje jugador, Personaje enemigo) {

        switch (tipo.toLowerCase()) {

            case "cura":
                jugador.setVida(jugador.getVida() + valor);
                System.out.println(jugador.getNombre() + " se cura " + valor);
                break;

            case "daño":
                jugador.setVida(jugador.getVida() - valor);
                System.out.println(jugador.getNombre() + " recibe " + valor + " de daño");
                break;

            case "defensa":
                jugador.setDefensa(jugador.getDefensa() + valor);
                System.out.println(jugador.getNombre() + " aumenta defensa en " + valor);
                break;

            case "revivir":
                if (!jugador.estaVivo()) {
                    jugador.setVida(valor);
                    System.out.println(jugador.getNombre() + " ha sido revivido");
                } else {
                    System.out.println("No se puede revivir a alguien vivo");
                }
                break;

            default:
                System.out.println("Objeto sin efecto");
        }
    }

    @Override
    public String toString() {
        return nombre + " [" + tipo + "] valor: " + valor;
    }
}