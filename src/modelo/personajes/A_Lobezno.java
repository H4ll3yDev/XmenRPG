package modelo.personajes;

import modelo.sistema.Personaje;

public class A_Lobezno extends Personaje {

    private String factorCuracion;

    // constructor
    public A_Lobezno() {
        super(
                "Lobezno", // nombre
                150, // vida
                new String[] { "Garras de adamantium", "Regeneración" }, // poderes
                35, // ataque
                20, // defensa
                "Regeneración extrema", // habilidad
                150);

        this.factorCuracion = "Alto";
    }

    // CONSTRUCTOR PERSONALIZADO
    public A_Lobezno(String nombre, int vida, String[] poderes, int ataque, int defensa, String habilidad,
            int vidaMaxima,
            String factorCuracion) {
        super(nombre, vida, poderes, ataque, defensa, habilidad, vidaMaxima);
        this.factorCuracion = factorCuracion;
    }

    /*@Override
    public void atacar(){
        setAtaque(ataque);
    }*/

    public String getFactorCuracion() {
        return factorCuracion;
    }

    public void setFactorCuracion(String factorCuracion) {
        this.factorCuracion = factorCuracion;
    }

    // HABILIDAD
    @Override
    public void efectoPasivo() {
        curar(40);
        System.out.println(getNombre() + " se regenera automáticamente");
    }

}