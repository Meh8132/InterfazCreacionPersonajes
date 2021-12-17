package Interfaz.crearPJ;

import Interfaz.mostrarPJ.mostrarComponent;
import Logica.Fabrica.FabricaPJs;
import Logica.Fabrica.Personajes.Personaje;
import Logica.Guardar;
import servicios.Recursos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class crearComponent implements ActionListener {

    private crearTemplate ct;
    private mostrarComponent mostrarComponent;
    private Recursos recursos;
    private Guardar guardar;

    private int contadorRaza = -1, contadorClase = -1;

    public crearComponent() {
        ct = new crearTemplate(this);
        recursos = Recursos.getServicios();
        guardar = Guardar.getInstance();

        seteoBotones();
    }

    public void presentar() {
        if (mostrarComponent == null) {
            mostrarComponent = new mostrarComponent();
            ct.setVisible(false);
            ct = null;
        }
    }

    public void repaintPJ() {
        ct.getlPersonaje().removeAll();

        switch (contadorRaza) {
            case 0:
                if (contadorClase == 1)
                    ct.getlPersonaje().setIcon(recursos.getDraenei_chaman());
                if (contadorClase == 5)
                    ct.getlPersonaje().setIcon(recursos.getDraenei_sacerdote());
                break;
            case 1:
                if (contadorClase == 2)
                    ct.getlPersonaje().setIcon(recursos.getElfo_guerrero());
                if (contadorClase == 4)
                    ct.getlPersonaje().setIcon(recursos.getElfo_picaro());
                break;
            case 2:
                if (contadorClase == 1)
                    ct.getlPersonaje().setIcon(recursos.getEnano_chaman());
                if (contadorClase == 3)
                    ct.getlPersonaje().setIcon(recursos.getEnano_paladin());
                break;
            case 3:
                if (contadorClase == 2)
                    ct.getlPersonaje().setIcon(recursos.getHumano_guerreo());
                if (contadorClase == 3)
                    ct.getlPersonaje().setIcon(recursos.getHumano_paladin());
                if (contadorClase == 5)
                    ct.getlPersonaje().setIcon(recursos.getHumano_sacerdote());
                break;
            case 4:
                if (contadorClase == 0)
                    ct.getlPersonaje().setIcon(recursos.getOrco_brujo());
                if (contadorClase == 2)
                    ct.getlPersonaje().setIcon(recursos.getOrco_guerrero());
                if (contadorClase == 4)
                    ct.getlPersonaje().setIcon(recursos.getOrco_picaro());
                break;
            case 5:
                if (contadorClase == 1)
                    ct.getlPersonaje().setIcon(recursos.getTauren_chaman());
                if (contadorClase == 3)
                    ct.getlPersonaje().setIcon(recursos.getTauren_paladin());
                break;
            case 6:
                if (contadorClase == 0)
                    ct.getlPersonaje().setIcon(recursos.getTroll_brujo());
                if (contadorClase == 1)
                    ct.getlPersonaje().setIcon(recursos.getTroll_chaman());
                if (contadorClase == 4)
                    ct.getlPersonaje().setIcon(recursos.getTroll_picaro());
                break;
            case 7:
                if (contadorClase == 0)
                    ct.getlPersonaje().setIcon(recursos.getUndead_brujo());
                if (contadorClase == 4)
                    ct.getlPersonaje().setIcon(recursos.getUndead_picaro());
                break;
        }

        ct.repaint();
    }

    public void repaintMontura() {
        ct.getlMontura().removeAll();

        if (contadorClase == 0) {
            ct.getlMontura().setIcon(recursos.getMontura_brujo());
        } else if (contadorClase == 1) {
            ct.getlMontura().setIcon(recursos.getMontura_chaman());
        } else if (contadorClase == 2) {
            ct.getlMontura().setIcon(recursos.getMontura_guerrero());
        } else if (contadorClase == 3) {
            ct.getlMontura().setIcon(recursos.getMontura_paladin());
        } else if (contadorClase == 4) {
            ct.getlMontura().setIcon(recursos.getMontura_picaro());
        } else if (contadorClase == 5) {
            ct.getlMontura().setIcon(recursos.getMontura_sacerdote());
        }

        ct.repaint();
    }

    public void seteoBotones() {
        for (JButton boton : ct.getListadoClases()) {
            boton.setVisible(false);
        }
        repaintPJ();
    }

    public void cambierTexto() {
        Personaje personaje = FabricaPJs.construir(contadorRaza);
        ct.getlDescripcion().setText("<html><b>" + personaje.descripcion() + "</b></html>");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean control = false;

        int numClon = 1;

        if (!(ct.getTxtClon().getText().equals("") || ct.getTxtClon().getText().equals(null))) {
            numClon = Integer.parseInt(ct.getTxtClon().getText());
        }

        for (int i = 0; i < 8; i++) {
            if (e.getSource() == ct.getListadoRazas()[i]) {
                contadorRaza = i;
                control = true;
            }
        }

        for (int i = 0; i < 6; i++) {
            if (e.getSource() == ct.getListadoClases()[i]) {
                contadorClase = i;
                repaintPJ();
                control = false;
            }
        }

        if (control) {
            cambierTexto();
            switch (contadorRaza) {
                case 0:
                    contadorClase = 1;
                    seteoBotones();
                    ct.getListadoClases()[1].setVisible(true);
                    ct.getListadoClases()[5].setVisible(true);
                    break;
                case 1:
                    contadorClase = 2;
                    seteoBotones();
                    ct.getListadoClases()[2].setVisible(true);
                    ct.getListadoClases()[4].setVisible(true);
                    break;
                case 2:
                    contadorClase = 1;
                    seteoBotones();
                    ct.getListadoClases()[1].setVisible(true);
                    ct.getListadoClases()[3].setVisible(true);
                    break;
                case 3:
                    contadorClase = 2;
                    seteoBotones();
                    ct.getListadoClases()[2].setVisible(true);
                    ct.getListadoClases()[3].setVisible(true);
                    ct.getListadoClases()[5].setVisible(true);
                    break;
                case 4:
                    contadorClase = 0;
                    seteoBotones();
                    ct.getListadoClases()[0].setVisible(true);
                    ct.getListadoClases()[2].setVisible(true);
                    ct.getListadoClases()[4].setVisible(true);
                    break;
                case 5:
                    contadorClase = 1;
                    seteoBotones();
                    ct.getListadoClases()[1].setVisible(true);
                    ct.getListadoClases()[3].setVisible(true);
                    break;
                case 6:
                    contadorClase = 0;
                    seteoBotones();
                    ct.getListadoClases()[0].setVisible(true);
                    ct.getListadoClases()[1].setVisible(true);
                    ct.getListadoClases()[4].setVisible(true);
                    break;
                case 7:
                    contadorClase = 0;
                    seteoBotones();
                    ct.getListadoClases()[0].setVisible(true);
                    ct.getListadoClases()[4].setVisible(true);
                    break;
            }
        }

        if (contadorRaza == -1){
            if (e.getSource() != ct.getbMostar())
                JOptionPane.showMessageDialog(null,"No has contruido el personaje");
        } else {
            if (e.getSource() == ct.getbCrear()) {
                System.out.println();
                if (ct.getEntradaTexto().getText().equals("") || ct.getEntradaTexto().getText().equals(null)) {
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre");
                } else {
                    if (numClon >= 1 && numClon <= 10) {
                        guardar.crearPersonaje(ct.getEntradaTexto().getText(), contadorRaza, contadorClase, numClon);
                        JOptionPane.showMessageDialog(null,"Personaje Creado: " + contadorRaza + " " + contadorClase);
                    } else {
                        JOptionPane.showMessageDialog(null,"Cantidad del mismo pj permitida 1 a 10 (al no ingresar valor solo se crea uno)");
                    }
                }
            }
        }

        if (contadorClase != -1){
            repaintMontura();
        }

        if (e.getSource() == ct.getbMostar()) {
            presentar();
        }
    }
}
