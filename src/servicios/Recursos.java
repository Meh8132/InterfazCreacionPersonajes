package servicios;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Recursos {

    private static Recursos servicios;
    private ObjetosGraficos graficos;

    private Font fBotonVentana;
    private Border border;

    private ImageIcon ifondo;

    private ImageIcon draenei_chaman, draenei_sacerdote, elfo_guerrero, elfo_picaro, enano_chaman, enano_paladin;
    private ImageIcon humano_guerreo, humano_paladin, humano_sacerdote, orco_brujo, orco_guerrero, orco_picaro;
    private ImageIcon tauren_chaman, tauren_paladin, troll_brujo, troll_chaman, troll_picaro, undead_brujo, undead_picaro;

    private ImageIcon icono_brujo, icono_chaman, icono_guerrero, icono_paladin, icono_picaro, icono_sacerdote;
    private ImageIcon icono_draenei, icono_elfo, icono_enano, icono_humano, icono_orco, icono_tauren, icono_troll, icono_undead;

    private ImageIcon montura_brujo, montura_chaman, montura_guerrero, montura_paladin, montura_picaro, montura_sacerdote;

    private ImageIcon iDimAux;

    public Recursos() {
        graficos = ObjetosGraficos.getServicio();

        crearImagenes();
        //crearColores();
        crearFuentes();
        //crearBordes();
    }

    public ImageIcon redimFondo(ImageIcon fondo) {
        iDimAux = new ImageIcon(fondo.getImage().getScaledInstance(1200,700, Image.SCALE_AREA_AVERAGING));
        return iDimAux;
    }

    public ImageIcon redimPersonaje(ImageIcon personaje) {
        iDimAux = new ImageIcon(personaje.getImage().getScaledInstance(400,533, Image.SCALE_AREA_AVERAGING));
        return iDimAux;
    }

    public ImageIcon redimIconos(ImageIcon icono) {
        iDimAux = new ImageIcon(icono.getImage().getScaledInstance(35,35, Image.SCALE_AREA_AVERAGING));
        return iDimAux;
    }

    public ImageIcon redimMontura(ImageIcon montura) {
        iDimAux = new ImageIcon(montura.getImage().getScaledInstance(358,400, Image.SCALE_AREA_AVERAGING));
        return iDimAux;
    }

    public void crearImagenes() {
        ifondo = new ImageIcon("src/imagenes/fondo.jpeg");

        draenei_chaman = new ImageIcon("src/imagenes/Draenei chaman.png");
        draenei_sacerdote = new ImageIcon("src/imagenes/Draenei sacerdote.png");
        elfo_guerrero = new ImageIcon("src/imagenes/Elfo Guerrero.png");
        elfo_picaro = new ImageIcon("src/imagenes/Elfo picaro.png");
        enano_chaman = new ImageIcon("src/imagenes/Enano chaman.png");
        enano_paladin = new ImageIcon("src/imagenes/Enano paladin.png");
        humano_guerreo = new ImageIcon("src/imagenes/Humano guerrero.png");
        humano_paladin = new ImageIcon("src/imagenes/Humano paladin.png");
        humano_sacerdote = new ImageIcon("src/imagenes/Humano sacerdote.png");
        orco_brujo = new ImageIcon("src/imagenes/Orco brujo.png");
        orco_guerrero = new ImageIcon("src/imagenes/Orco guerrero.png");
        orco_picaro = new ImageIcon("src/imagenes/Orco picaro.png");
        tauren_chaman = new ImageIcon("src/imagenes/Tauren chaman.png");
        tauren_paladin = new ImageIcon("src/imagenes/Tauren paladin.png");
        troll_brujo = new ImageIcon("src/imagenes/Troll brujo.png");
        troll_chaman = new ImageIcon("src/imagenes/Troll chaman.png");
        troll_picaro = new ImageIcon("src/imagenes/Troll picaro.png");
        undead_brujo = new ImageIcon("src/imagenes/Undead brujo.png");
        undead_picaro = new ImageIcon("src/imagenes/Undead picaro.png");

        icono_brujo = new ImageIcon("src/imagenes/icono brujo.png");
        icono_chaman = new ImageIcon("src/imagenes/icono chaman.png");
        icono_guerrero = new ImageIcon("src/imagenes/icono guerrero.png");
        icono_paladin = new ImageIcon("src/imagenes/icono paladin.png");
        icono_picaro = new ImageIcon("src/imagenes/icono picaro.png");
        icono_sacerdote = new ImageIcon("src/imagenes/icono sacerdote.png");

        icono_draenei = new ImageIcon("src/imagenes/icono draenei.png");
        icono_elfo = new ImageIcon("src/imagenes/icono elfo.png");
        icono_enano = new ImageIcon("src/imagenes/icono enano.png");
        icono_humano = new ImageIcon("src/imagenes/icono humano.png");
        icono_orco = new ImageIcon("src/imagenes/icono orco.png");
        icono_tauren = new ImageIcon("src/imagenes/icono tauren.png");
        icono_troll = new ImageIcon("src/imagenes/icono troll.png");
        icono_undead = new ImageIcon("src/imagenes/icono undead.png");

        montura_brujo = new ImageIcon("src/imagenes/montura brujo.png");
        montura_chaman = new ImageIcon("src/imagenes/montura chaman.png");
        montura_guerrero = new ImageIcon("src/imagenes/montura guerrero.png");
        montura_paladin = new ImageIcon("src/imagenes/montura paladin.png");
        montura_picaro= new ImageIcon("src/imagenes/montura picaro.png");
        montura_sacerdote = new ImageIcon("src/imagenes/montura sacerdote.png");
    }
    public ImageIcon getIfondo() { return redimFondo(ifondo); }

    public ImageIcon getDraenei_chaman() { return redimPersonaje(draenei_chaman); }
    public ImageIcon getDraenei_sacerdote() { return redimPersonaje(draenei_sacerdote); }
    public ImageIcon getElfo_guerrero() { return redimPersonaje(elfo_guerrero); }
    public ImageIcon getElfo_picaro() { return redimPersonaje(elfo_picaro); }
    public ImageIcon getEnano_chaman() { return redimPersonaje(enano_chaman); }
    public ImageIcon getEnano_paladin() { return redimPersonaje(enano_paladin); }
    public ImageIcon getHumano_guerreo() { return redimPersonaje(humano_guerreo); }
    public ImageIcon getHumano_paladin() { return redimPersonaje(humano_paladin); }
    public ImageIcon getHumano_sacerdote() { return redimPersonaje(humano_sacerdote); }
    public ImageIcon getOrco_brujo() { return redimPersonaje(orco_brujo); }
    public ImageIcon getOrco_guerrero() { return redimPersonaje(orco_guerrero); }
    public ImageIcon getOrco_picaro() { return redimPersonaje(orco_picaro); }
    public ImageIcon getTauren_chaman() { return redimPersonaje(tauren_chaman); }
    public ImageIcon getTauren_paladin() { return redimPersonaje(tauren_paladin); }
    public ImageIcon getTroll_brujo() { return redimPersonaje(troll_brujo); }
    public ImageIcon getTroll_chaman() { return redimPersonaje(troll_chaman); }
    public ImageIcon getTroll_picaro() { return redimPersonaje(troll_picaro); }
    public ImageIcon getUndead_brujo() { return redimPersonaje(undead_brujo); }
    public ImageIcon getUndead_picaro() { return redimPersonaje(undead_picaro); }

    public ImageIcon getIcono_brujo() { return redimIconos(icono_brujo); }
    public ImageIcon getIcono_chaman() { return redimIconos(icono_chaman); }
    public ImageIcon getIcono_guerrero() { return redimIconos(icono_guerrero); }
    public ImageIcon getIcono_paladin() { return redimIconos(icono_paladin); }
    public ImageIcon getIcono_picaro() { return redimIconos(icono_picaro); }
    public ImageIcon getIcono_sacerdote() { return redimIconos(icono_sacerdote); }

    public ImageIcon getIcono_draenei() { return redimIconos(icono_draenei); }
    public ImageIcon getIcono_elfo() { return redimIconos(icono_elfo); }
    public ImageIcon getIcono_enano() { return redimIconos(icono_enano); }
    public ImageIcon getIcono_humano() { return redimIconos(icono_humano); }
    public ImageIcon getIcono_orco() { return redimIconos(icono_orco); }
    public ImageIcon getIcono_tauren() { return redimIconos(icono_tauren); }
    public ImageIcon getIcono_troll() { return redimIconos(icono_troll); }
    public ImageIcon getIcono_undead() { return redimIconos(icono_undead); }

    public ImageIcon getMontura_brujo() { return redimMontura(montura_brujo); }
    public ImageIcon getMontura_chaman() { return redimMontura(montura_chaman); }
    public ImageIcon getMontura_guerrero() { return redimMontura(montura_guerrero); }
    public ImageIcon getMontura_paladin() { return redimMontura(montura_paladin); }
    public ImageIcon getMontura_picaro() { return redimMontura(montura_picaro); }
    public ImageIcon getMontura_sacerdote() { return redimMontura(montura_sacerdote); }

    public void crearFuentes() {
        fBotonVentana = new Font("Arial Nova",Font.PLAIN,20);
    }
    public Font getfBotonVentana() { return fBotonVentana; }

    public void crearColores() {

    }


    public Border getBorderRaza() {
        return border = BorderFactory.createLineBorder(Color.red,3,true);
    }

    public Border getBorderClases() {
        return border = BorderFactory.createLineBorder(Color.blue,3,true);
    }

    public Border getBorderDescripcion()  {
        return border = BorderFactory.createLineBorder(Color.green,3,true);
    }

    public Border getBorderNombre() {
        return border = BorderFactory.createLineBorder(Color.BLACK,3,true);
    }
    public static Recursos getServicios() {

        if (servicios == null){
            servicios = new Recursos();
        }
        return servicios;
    }
}