package Logica.Fabrica.Personajes;

public class Draenei implements Personaje{
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
        return "Draenei";
    }

    @Override
    public String descripcion() {
        return "Lejos de su hogar, Argus, los honorables draenei huyeron " +
                "de la Legión Ardiente durante eones antes de encontrar un planeta" +
                " remoto donde asentarse. Compartieron ese mundo con los " +
                "chamanisticos orcos y lo llamaron Draenor. Con el tiempo, la Legión " +
                "corrompió a los orcos, quienes hicieron la guerra y casi exterminaron" +
                " a los pacificos draenei. Unos pocos afortunados escaparon y llegaron " +
                "a Azeroth donde ahora buscan aliados en su batalla contra la Legión ardiente.";
    }

    @Override
    public Personaje clonar() {
        Draenei yo = null;

        try {
            yo = (Draenei) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
