package Logica.Fabrica.Personajes;

public class Undead implements Personaje{
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
        return "No-Muerto";
    }

    @Override
    public String descripcion() {
        return "Antaño esclavos descerebrados del terrible Rey Exánime," +
                " los espantosos Renegados lo han derrocado y ahora juran lealtad" +
                " a la malvada Reina alma en pena, Sylvanas. Bajo su mando, los " +
                "ejércitos de Renegados se han hecho con las ruinas de Lordaeron. " +
                "Cada dia es una lucha contra los vengativos humanos que los quieren " +
                "erradicar, y una batalla constante contra los allados de la Horda que " +
                "desconfian de los siniestros planes de los no muertos.";
    }

    @Override
    public Personaje clonar() {
        Undead yo = null;

        try {
            yo = (Undead) clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return yo;
    }
}
