package model;

public class ArbitroPrincipal extends Arbitro {
    public ArbitroPrincipal(String nombre, int edad) {
        super(nombre, edad);
    }

     @Override
    public String desplazarse() {
        return "Árbitro Principal " + nombre + " se desplaza sobre el hielo.";
    }
}