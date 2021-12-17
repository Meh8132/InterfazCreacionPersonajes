package Logica.Fabrica.Personajes;

public class Elfo implements Personaje{
    String nombre;
    int clase;

    @Override
    public void setNombre(String xnombre) {
        nombre = xnombre;
    }

    @Override
    public void setClase(int xclase) {
        clase = xclase;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getClase() {
        return clase;
    }

    @Override
    public String raza() {
        return "Elfo";
    }

    @Override
    public String descripcion() {
        return "Hace diez mil años, los elfos de la noche fundaron un vasto imperio, " +
                "pero el uso imprudente de la magia primaria los llevó a la ruina. Consternados" +
                ", se retiraron a los bosques donde se aislaron hasta el regreso de su antiguo" +
                " enemigo: la Legión Ardiente. Entonces no tuvieron más opción que abandonar" +
                " su reclusión y luchar por su lugar en el nuevo mundo.";
    }

    @Override
    public Personaje clonar() {
        Elfo yo = null;

        try {
            yo = (Elfo) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
