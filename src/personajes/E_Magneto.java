package personajes;

import sistema.*;

public class E_Magneto extends Enemigo {

    private int campoMagnetico;

    public E_Magneto() {
        super(
                "Magneto",
                180,
                new String[] { "Control del metal" },
                80,
                30,
                "Dominio magnético",
                180);
        
        this.campoMagnetico = 20;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int danio = getAtaque() + campoMagnetico - objetivo.getDefensa();
        if (danio < 0)
            danio = 0;

        objetivo.setVida(objetivo.getVida() - danio);

        System.out.println(getNombre() + " ataca con magnetismo causando " + danio);
    }
    @Override
   public void usarHabilidad(Personaje objetivo) {
    objetivo.turnosInmovilizado = 2;
    System.out.println(getNombre() + " inmoviliza a " + objetivo.getNombre() + " durante 2 turnos");
}
}