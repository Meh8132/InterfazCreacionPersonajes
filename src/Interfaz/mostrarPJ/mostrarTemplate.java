package Interfaz.mostrarPJ;

import servicios.ObjetosGraficos;
import servicios.Recursos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class mostrarTemplate extends JFrame {

    private mostrarComponent mc;
    private ObjetosGraficos graficos;
    private Recursos recursos;

    private JPanel pFondo;
    private JLabel lFondo, lPersonaje, lMontura;

    private JButton bCrear;

    private Font texto;
    private Color colorHeader, colorAlter;

    private JScrollPane pTabla;
    private JPanel pCorner;
    private JTable tabla;
    private JTableHeader header;
    private DefaultTableModel modelo;
    private String[] cabecera = {"Nombre", "Raza", "Clase"};

    public mostrarTemplate (mostrarComponent mostrarC) {
        super("Listado de persoanjes");
        mc = mostrarC;
        graficos = ObjetosGraficos.getServicio();
        recursos = Recursos.getServicios();

        pFondo = graficos.buildJPanel(0,0,1200,700,null,null);
        this.add(pFondo);

        texto = new Font("Arial Nova", Font.PLAIN,15);
        colorHeader  = new Color(55,52,53);
        colorAlter = new Color(75, 69, 69, 224);

        botones();
        personaje();
        montura();

        crearTabla();
        crearFondo();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearTabla() {
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(cabecera);

        tabla = new JTable();
        tabla.setModel(modelo);

        tabla.setRowHeight(40);
        tabla.setShowHorizontalLines(false);
        tabla.setShowVerticalLines(false);

        tabla.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(100);

        header = tabla.getTableHeader();
        header.setPreferredSize(new Dimension(350,30));

        pTabla = graficos.construirPanelBarra(
                tabla,820,10,350,550,Color.black,recursos.getBorderNombre()
        );

        header.setDefaultRenderer(
                graficos.devolverTablaPersonalizada(
                        colorHeader,null,null,Color.WHITE,texto
                )
        );

        tabla.setDefaultRenderer(Object.class,
                graficos.devolverTablaPersonalizada(
                        Color.black,colorAlter,Color.WHITE,Color.white,texto
                )
        );

        pTabla.getVerticalScrollBar().setUI(
                graficos.devolverScrollPersonalizado(
                        7,10,Color.WHITE,Color.GRAY,colorHeader
                )
        );

        pCorner = new JPanel();
        pCorner.setBackground(colorHeader);
        pTabla.setCorner(JScrollPane.UPPER_RIGHT_CORNER,pCorner);

        tabla.addMouseListener(mc);
        pFondo.add(pTabla);
    }
    public JTable getTabla() { return tabla; }
    public DefaultTableModel getModelo() { return modelo; }

    public void crearFondo() {
        lFondo = graficos.buildJLabel("",0,0,1200,700,"","", recursos.getIfondo(), null,null,null,null);
        pFondo.add(lFondo);
    }

    public void personaje() {
        lPersonaje = graficos.buildJLabel("",350,50,400,533,"","",null,null,null,null,null);
        pFondo.add(lPersonaje);
    }
    public JLabel getlPersonaje() { return lPersonaje; }

    public void montura() {
        lMontura = graficos.buildJLabel("",100,116, 358,400,"","",null,null,null,null,null);
        pFondo.add(lMontura);
    }
    public JLabel getlMontura() { return lMontura; }

    public void botones() {
        bCrear = graficos.buildJButton("Crear Personaje",970,600,200,50,"","",null,Color.red,Color.WHITE,null,true,recursos.getfBotonVentana(),null);
        bCrear.addActionListener(mc);
        pFondo.add(bCrear);


    }
    public JButton getbCrear() { return bCrear; }
}
