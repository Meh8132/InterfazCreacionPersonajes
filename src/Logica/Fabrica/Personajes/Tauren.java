package Logica.Fabrica.Personajes;

public class Tauren implements Personaje{
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
        return "Tauren";
    }

    @Override
    public String descripcion() {
        return "Los tauren se esfuerzan continuamente para preservar el equilibrio" +
                " de la Naturaleza y respetar los deseos de la diosa que veneran," +
                " la Madre Tierra. Muchas de las tribus nomadas tauren se han unido" +
                " bajo un único estandarte y se han asentado en las fértiles llanuras " +
                "de Mulgore. De no haber sido por la intervención oportuna de los orcos" +
                ", los centauros merodeadores habrían aniquilado a toda la raza. Los tauren" +
                " hacen honor a esta deuda de sangre Juchando junto a la Horda para proteger su tierra.";
    }

    @Override
    public Personaje clonar() {
        Tauren yo = null;

        try {
            yo = (Tauren) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
