package sistema;

import java.util.Random;
import java.util.Scanner;

import personajes.A_Lobezno;

public class Combate {

    private Personaje jugador;
    private Personaje enemigo;
    private Scanner sc;
    private Random random;

    public Combate(Personaje jugador, Personaje enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.sc = new Scanner(System.in);
        this.random = new Random();
    }

    public void iniciarCombate() {

        System.out.println("COMBATE INICIADO");

        do {

            mostrarEstado();

            turnoJugador();

            if (enemigo.estaVivo()) {
                turnoEnemigo();
            }

        } while (jugador.estaVivo() && enemigo.estaVivo());

        if (jugador.estaVivo()) {
            System.out.println("\nHAS GANADO EL COMBATE");
        } else {
            System.out.println("\nHAS SIDO DERROTADO");
        }
    }

    private void mostrarEstado() {

        System.out.println("\n==============================");
        System.out.println("Usuario:");
        System.out.println(jugador);
        System.out.println("\nEnemigo:");
        System.out.println(enemigo);
        System.out.println("\n");
    }

    private void turnoJugador() {

        System.out.println("Tu turno:");

        if (!jugador.puedeActuar()) {
            System.out.println(jugador.getNombre() + " está inmovilizado y no puede actuar");
            jugador.actualizarEstados();
            return;
        }

        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.println("3. Usar poción");
        System.out.println("4. Huir");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                jugador.atacar(enemigo);
                break;

            case 2:
                jugador.defender();
                break;

            case 3:
                usarPocion();
                break;

            case 4:
                if (intentarHuir()) {
                    System.out.println("Has huido del combate");
                    System.exit(0);
                } else {
                    System.out.println("No has podido huir");
                }
                break;

            default:
                System.out.println("Opción inválida");
        }

        jugador.actualizarEstados();
    }

    private void turnoEnemigo() {

        System.out.println("\nTURNO DEL ENEMIGO:");

        if (!enemigo.puedeActuar()) {
            System.out.println(enemigo.getNombre() + " está inmovilizado y no puede actuar");
            enemigo.actualizarEstados();
            return;
        }

        int accion = random.nextInt(2);

        if (accion == 0) {
            enemigo.atacar(jugador);
        } else {
            enemigo.usarHabilidad(jugador);
        }

        enemigo.actualizarEstados();

        aplicarEfectosPostTurno();
    }

    private void aplicarEfectosPostTurno() {

        if (jugador instanceof A_Lobezno lobezno) {
            lobezno.curar(40);
            System.out.println(lobezno.getNombre() + " se regenera automáticamente");
        }
    }

    private void usarPocion() {

        int cura = 30;
        jugador.setVida(jugador.getVida() + cura);

        System.out.println("Usas una poción y recuperas " + cura + " de vida");
    }

    private boolean intentarHuir() {

        int probabilidad = random.nextInt(100);

        return probabilidad < 30;
    }
}