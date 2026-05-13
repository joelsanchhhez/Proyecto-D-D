package salesianos;

public class Personaje {

    protected String nombre;
    protected int vida;
    protected int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personaje objetivo) {
        objetivo.recibirDanio(this.ataque);
        System.out.println(
                this.nombre + " ataca a " + objetivo.getNombre() + " causando " + this.ataque + " puntos de daño.");
    }

    public void recibirDanio(int danio) {
        this.vida -= danio;

        if (this.vida < 0) {
            this.vida = 0;
        }

        System.out.println(this.nombre + " recibe " + danio + " puntos de daño. Vida actual: " + this.vida);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }
}