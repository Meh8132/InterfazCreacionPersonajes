package Interfaz.crearPJ;

import servicios.ObjetosGraficos;
import servicios.Recursos;

import javax.swing.*;
import java.awt.*;

public class crearTemplate extends JFrame {

    private crearComponent cc;
    private ObjetosGraficos graficos;
    private Recursos recursos;

    private Font textoPequeño;

    private JPanel pFondo, pRazas, pClases, pDescripcion;
    private JLabel lFondo,lDescripcion, lPersonaje, lMontura, lIndicacion;

    private JTextField entradaTexto, txtClon;

    private JButton bMostar, bCrear;

    private JButton bDraenei, bElfo, bEnano, bHumano, bOrco, bTauren, bTroll, bUndead;
    private JButton listadoRazas[] = {bDraenei, bElfo, bEnano, bHumano, bOrco, bTauren, bTroll, bUndead};

    private JButton bBrujo, bChaman, bGuerrero, bPaladin, bPicaro, bSacerdote;
    private JButton[] listadoClases = {bBrujo, bChaman, bGuerrero, bPaladin, bPicaro, bSacerdote};

    public crearTemplate(crearComponent crearC) {
        super("Crea tu personaje");
        cc = crearC;
        graficos = ObjetosGraficos.getServicio();
        recursos = Recursos.getServicios();

        pFondo = graficos.buildJPanel(0,0,1200,700,null,null);
        this.add(pFondo);

        textoPequeño = new Font("Arial Nova", Font.BOLD, 15);

        continuar();
        personaje();
        montura();
        descripcion();
        registrarPersonaje();
        crearPanelRazas();
        crearPanelClases();
        crearFondo();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearFondo() {
        lFondo = graficos.buildJLabel("",0,0,1200,700,"","",recursos.getIfondo(),null,null,null,null);
        pFondo.add(lFondo);
    }

    public void descripcion() {
        lDescripcion = graficos.buildJLabel("",15,470,350,170,"izquierda","centro",null,null,Color.WHITE,null, null);
        pFondo.add(lDescripcion);

        pDescripcion = graficos.buildJPanel(10,470,360,170,Color.BLACK,recursos.getBorderDescripcion());
        pFondo.add(pDescripcion);
    }
    public JLabel getlDescripcion() { return lDescripcion; }

    public void registrarPersonaje() {
        lIndicacion = graficos.buildJLabel("Cantidad 1 a 10", 590,560,120,40,"centro","centro",null,null,Color.black,textoPequeño,null);
        pFondo.add(lIndicacion);

        entradaTexto = graficos.buildJTextField("",420,600, 200,40,"centro",Color.gray,Color.white,Color.WHITE,textoPequeño, recursos.getBorderNombre());
        pFondo.add(entradaTexto);

        txtClon = graficos.buildJTextField("",630,600,50,40,"centro",Color.gray,Color.white,Color.WHITE,textoPequeño, recursos.getBorderNombre());
        pFondo.add(txtClon);

        bCrear = graficos.buildJButton("Crear",690,600,100,40,"centro","centro",null,Color.red,Color.WHITE,null,true,textoPequeño,recursos.getBorderRaza());
        bCrear.addActionListener(cc);
        pFondo.add(bCrear);
    }
    public JTextField getEntradaTexto() { return entradaTexto; }
    public JTextField getTxtClon() { return txtClon; }
    public JButton getbCrear() { return bCrear; }

    public void personaje() {
        lPersonaje = graficos.buildJLabel("",500,50,400,533,"","",recursos.getDraenei_chaman(),null,null,null,null);
        pFondo.add(lPersonaje);
    }
    public JLabel getlPersonaje() { return lPersonaje; }

    public void montura() {
        lMontura = graficos.buildJLabel("",300,116, 358,400,"","",recursos.getMontura_chaman(),null,null,null,null);
        pFondo.add(lMontura);
    }
    public JLabel getlMontura() { return lMontura; }

    public void continuar() {
        bMostar = graficos.buildJButton("Mostrar Personajes",970,600,200,50,"","",null,Color.red,Color.WHITE,null,true,recursos.getfBotonVentana(),null);
        bMostar.addActionListener(cc);
        pFondo.add(bMostar);
    }
    public JButton getbMostar() { return bMostar; }

    public void crearPanelRazas() {
        pRazas = graficos.buildJPanel(10,100,280, 240,Color.BLACK, recursos.getBorderRaza());
        pFondo.add(pRazas);

        listadoRazas[0] = graficos.buildJButton("Draenei",5,20,140,50,"izquierda", "centro",recursos.getIcono_draenei(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[0].addActionListener(cc);
        pRazas.add(listadoRazas[0]);

        listadoRazas[1] = graficos.buildJButton("Elfo",145,20,140,50,"izquierda", "centro",recursos.getIcono_elfo(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[1].addActionListener(cc);
        pRazas.add(listadoRazas[1]);

        listadoRazas[2] = graficos.buildJButton("Enano",5,70,140,50,"izquierda", "centro",recursos.getIcono_enano(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[2].addActionListener(cc);
        pRazas.add(listadoRazas[2]);

        listadoRazas[3] = graficos.buildJButton("Humano",145,70,140,50,"izquierda", "centro",recursos.getIcono_humano(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[3].addActionListener(cc);
        pRazas.add(listadoRazas[3]);

        listadoRazas[4] = graficos.buildJButton("Orco",5,120,140,50,"izquierda", "centro",recursos.getIcono_orco(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[4].addActionListener(cc);
        pRazas.add(listadoRazas[4]);

        listadoRazas[5] = graficos.buildJButton("Tauren",145,120,140,50,"izquierda", "centro",recursos.getIcono_tauren(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[5].addActionListener(cc);
        pRazas.add(listadoRazas[5]);

        listadoRazas[6] = graficos.buildJButton("Troll",5,170,140,50,"izquierda", "centro",recursos.getIcono_troll(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[6].addActionListener(cc);
        pRazas.add(listadoRazas[6]);

        listadoRazas[7] = graficos.buildJButton("No muerto",145,170,140,50,"izquierda", "centro",recursos.getIcono_undead(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoRazas[7].addActionListener(cc);
        pRazas.add(listadoRazas[7]);
    }
    public JButton[] getListadoRazas() { return listadoRazas; }

    public void crearPanelClases() {
        pClases = graficos.buildJPanel(950,100,200,400,Color.BLACK,recursos.getBorderClases());
        pFondo.add(pClases);

        listadoClases[0] = graficos.buildJButton("Brujo",25,30,140,50,"izquierda", "centro",recursos.getIcono_brujo(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoClases[0].addActionListener(cc);
        pClases.add(listadoClases[0]);

        listadoClases[1] = graficos.buildJButton("Chaman",25,85,140,50,"izquierda", "centro",recursos.getIcono_chaman(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoClases[1].addActionListener(cc);
        pClases.add(listadoClases[1]);

        listadoClases[2] = graficos.buildJButton("Guerrero",25,140,140,50,"izquierda", "centro",recursos.getIcono_guerrero(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoClases[2].addActionListener(cc);
        pClases.add(listadoClases[2]);

        listadoClases[3] = graficos.buildJButton("Paladin",25,195,140,50,"izquierda", "centro",recursos.getIcono_paladin(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoClases[3].addActionListener(cc);
        pClases.add(listadoClases[3]);

        listadoClases[4] = graficos.buildJButton("Picaro",25,250,140,50,"izquierda", "centro",recursos.getIcono_picaro(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoClases[4].addActionListener(cc);
        pClases.add(listadoClases[4]);

        listadoClases[5] = graficos.buildJButton("Sacerdote",25,305,140,50,"izquierda", "centro",recursos.getIcono_sacerdote(),null,Color.WHITE,null,false,textoPequeño,null);
        listadoClases[5].addActionListener(cc);
        pClases.add(listadoClases[5]);
    }
    public JButton[] getListadoClases() { return listadoClases; }
}
