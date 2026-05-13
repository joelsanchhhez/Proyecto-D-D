import salesianos.Guerrero;
import salesianos.Mago;

public class App {

    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Thorin");
        Mago mago = new Mago("Merlín");

        System.out.println("=== Información de los personajes ===");
        guerrero.mostrarInfo();
        System.out.println();
        mago.mostrarInfo();

        System.out.println();
        System.out.println("=== Combate ===");

        guerrero.atacar(mago);
        mago.lanzarHechizo(guerrero);
        guerrero.ataqueEspecial(mago);

        System.out.println();
        System.out.println("=== Estado final ===");
        guerrero.mostrarInfo();
        System.out.println();
        mago.mostrarInfo();
    }
}