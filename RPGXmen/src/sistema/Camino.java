package sistema;
class Camino {

    private String descripcion;
    private Camino[] caminos = new Camino[4]; // máximo 4 caminos posibles

    public Camino(String descripcion) {
        this.descripcion = descripcion;
    }

    public void conectarCamino(int posicion, Camino nuevoCamino) {
        if (posicion >= 0 && posicion < caminos.length) {
            caminos[posicion] = nuevoCamino;
        }
    }

    public Camino getCamino(int posicion) {
        if (posicion >= 0 && posicion < caminos.length) {
            return caminos[posicion];
        }
        return null;
    }
}