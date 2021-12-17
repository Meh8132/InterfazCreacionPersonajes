package Logica.Fabrica.Personajes;

public class Humano implements Personaje{
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
        return "Humano";
    }

    @Override
    public String descripcion() {
        return "Los humanos son una raza joven y, por lo tanto, muy versátil. Dominan" +
                " las artes del combate, la artesanía y la magia con una eficacia" +
                " sorprendente. Su valor y optimismo los han llevado a levantar algunos" +
                " de los reinos más espléndidos del mundo. En esta turbulenta era, tras" +
                " generaciones de conflictos. los humanos quieren recuperar la gloria que" +
                " los distinguió otrora y forjarse un nuevo y brillante futuro.";
    }

    @Override
    public Personaje clonar() {
        Humano yo = null;

        try {
            yo = (Humano) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
