package modelo.sistema;

import java.util.ArrayList;

public class Inventario {

    private int capacidadMaxima;
    private ArrayList<Objeto> objetos;

    public Inventario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.objetos = new ArrayList<>();
    }
    
    // añadir objeto
    public void agregarObjeto(Objeto obj) {
        if (objetos.size() < capacidadMaxima) {
            objetos.add(obj);
            System.out.println(obj.getNombre() + " añadido al inventario.");
        } else {
            System.out.println("Inventario lleno.");
        }
    }

    // usar objeto
    public void usarObjeto(Objeto obj, Personaje usuario) {

        switch (obj.getTipo().toLowerCase()) {

            case "cura":
                usuario.setVida(usuario.getVida() + obj.getValor());
                System.out.println(usuario.getNombre() + " se cura " + obj.getValor());
                break;

            case "ataque":
                usuario.setAtaque(usuario.getAtaque() + obj.getValor());
                System.out.println(usuario.getNombre() + " aumenta ataque en " + obj.getValor());
                break;

            case "revivir":
                if (!usuario.estaVivo()) {
                    usuario.setVida(obj.getValor());
                    System.out.println(usuario.getNombre() + " ha sido revivido!");
                }
                break;

            default:
                System.out.println("Objeto no válido");
        }

        objetos.remove(obj); // se consume
    }
    
    // GETTERS
    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }
}