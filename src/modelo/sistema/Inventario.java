package modelo.sistema;

import java.util.ArrayList;

public class Inventario {

    private int totalProductos;
    private int capacidadMaxima;
    private ArrayList<Inventario> categorias;
    

    //Constructor
    public Inventario (int totalProductos, int capacidadMaxima) {
        
    this.totalProductos = totalProductos;
    this.capacidadMaxima = capacidadMaxima;

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


    public ArrayList<Inventario> getCategorias() {
        return categorias;
    }


    public void setCategorias(ArrayList<Inventario> categorias) {
        this.categorias = categorias;
    }


}
