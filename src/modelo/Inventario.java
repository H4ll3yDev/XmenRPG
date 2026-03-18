package modelo;

import java.util.ArrayList;

public class Inventario {

    private int totalProductos;
    private int capacidadMaxima;
    private ArrayList<String> categorias;
    

    //Constructor
    public Inventario (int totalProductos, int capacidadMaxima) {
        
    this.totalProductos = totalProductos;
    this.capacidadMaxima = capacidadMaxima;
        
        System.out.println("BLYATTTTTTTTT");

    }


    public int getTotalProductos() {
        return totalProductos;
    }


    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }


    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }


    public ArrayList<String> getCategorias() {
        return categorias;
    }


    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }


}
