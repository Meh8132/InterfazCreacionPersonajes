package Logica.Fabrica.Personajes;

public class Enano implements Personaje{
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
        return "Enano";
    }

    @Override
    public String descripcion() {
        return "En el pasado, los enanos solo se preocupaban por las riquezas extraídas" +
                " de las entrañas de la tierra. Fue asi como hallaron vestigios de una" +
                " raza divina que, según parece, les dio vida... y derecho de nacimiento" +
                " encantado. Impulsados a aprender más por este descubrimiento, los enanos" +
                " se consagraron a la búsqueda de artefactos perdidos y el conocimiento arcano" +
                ". Hoy en día, hay arqueólogos enanos repartidos por todo el mundo.";
    }

    @Override
    public Personaje clonar() {
        Enano yo = null;

        try {
            yo = (Enano) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
