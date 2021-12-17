package Logica.Fabrica.Personajes;

public class Orco implements Personaje{
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
        return "Orco";
    }

    @Override
    public String descripcion() {
        return "La raza de los orcos es originaria del planeta Draenor. Este pueblo" +
                " pacifico, de creencias chamánicas, fue esclavizado por la Legión" +
                " Ardiente y forzado a participar en la guerra contra los humanos" +
                " de Azeroth. Aunque tuvieron que pasar muchos años, al final escaparon" +
                " de la corrupción de los demonios y recuperaron su Ilbertad. A dia" +
                " de hoy, luchan por su honor en un mundo que los odia y desprecia.";
    }

    @Override
    public Personaje clonar() {
        Orco yo = null;

        try {
            yo = (Orco) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
