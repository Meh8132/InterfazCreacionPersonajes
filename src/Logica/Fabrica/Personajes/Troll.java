package Logica.Fabrica.Personajes;

public class Troll implements Personaje{
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
        return "Troll";
    }

    @Override
    public String descripcion() {
        return "Los fieros trols de la tribu Lanza Negra habitaban las junglas de la" +
                " Vega de Tuercespina hasta que facciones guerreras los asediaron " +
                "por todos los flancos. La Horda de los orcos acudió en su ayuda y" +
                " convenció a los Lanza Negra de que cruzaran el Mare Magnum y se" +
                " establecieran en las tierras salvajes de Kalimdor. Aunque se aferran" +
                " a su herencia oscura, los Lanza Negra siguen abogando por una Horda unida" +
                ", y contribuyen con la fuerza de sus armas y su poderosa magia tribal a la causa común.";
    }

    @Override
    public Personaje clonar() {
        Troll yo = null;

        try {
            yo = (Troll) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
