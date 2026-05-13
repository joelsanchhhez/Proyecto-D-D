package salesianos;

public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero(String nombre) {
        super(nombre, 120, 20);
        this.fuerza = 30;
    }

    public void ataqueEspecial(Personaje objetivo) {
        int danioEspecial = this.ataque + this.fuerza;
        objetivo.recibirDanio(danioEspecial);
        System.out.println(
                this.nombre + " usa ataque especial de guerrero y causa " + danioEspecial + " puntos de daño.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Clase: Guerrero");
        super.mostrarInfo();
        System.out.println("Fuerza: " + fuerza);
    }
}