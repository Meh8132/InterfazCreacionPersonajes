package Logica;

import Logica.Fabrica.FabricaPJs;
import Logica.Fabrica.Personajes.Personaje;

import java.util.ArrayList;

public class Guardar {

    private static Guardar instance;
    private ArrayList<Personaje> misPersoanjes = new ArrayList<Personaje>();
    private Personaje nuevo, clonNuevo;

    public Guardar() {

    }

    public void crearPersonaje(String nombre, int raza, int clase, int clon) {
        nuevo = FabricaPJs.construir(raza);
        nuevo.setNombre(nombre);
        nuevo.setClase(clase);

        misPersoanjes.add(nuevo);

        if (clon != 1) {
            for (int i = 1; i < clon; i++) {
                clonNuevo = nuevo.clonar();
                if (clonNuevo != null) {
                    misPersoanjes.add(clonNuevo);
                }
            }
        }
    }

    public ArrayList<Personaje> getMisPersoanjes() {
        return misPersoanjes;
    }

    public static Guardar getInstance() {
        if (instance == null) {
            instance = new Guardar();
        }
        return instance;
    }
}
