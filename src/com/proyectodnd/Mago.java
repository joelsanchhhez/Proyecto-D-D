package com.proyectodnd;

public class Mago extends Personaje {

    private int mana;

    public Mago(String nombre) {
        super(nombre, 80, 15);
        this.mana = 100;
    }

    public void lanzarHechizo(Personaje objetivo) {
        if (mana >= 20) {
            int danioHechizo = 35;
            objetivo.recibirDanio(danioHechizo);
            mana -= 20;
            System.out.println(this.nombre + " lanza un hechizo y causa " + danioHechizo + " puntos de daño.");
            System.out.println("Maná restante: " + mana);
        } else {
            System.out.println(this.nombre + " no tiene suficiente maná para lanzar el hechizo.");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Clase: Mago");
        super.mostrarInfo();
        System.out.println("Maná: " + mana);
    }
}