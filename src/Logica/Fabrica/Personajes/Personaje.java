package Logica.Fabrica.Personajes;

public interface Personaje extends Cloneable {
    void setNombre(String xnombre);

    void setClase(int xclase);

    String getNombre();

    int getClase();

    String raza();

    String descripcion();

    Personaje clonar();
}
