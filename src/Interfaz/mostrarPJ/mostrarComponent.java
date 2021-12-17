package Interfaz.mostrarPJ;

import Interfaz.crearPJ.crearComponent;
import Logica.Fabrica.Personajes.Personaje;
import Logica.Guardar;
import servicios.Recursos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mostrarComponent implements ActionListener, MouseListener {

    private mostrarTemplate mt;
    private crearComponent crearComponent;
    private Recursos recursos;
    private Guardar guardar;

    private String[] clases = {"Brujo", "Chaman", "Guerrero", "Paladin", "Picaro", "Sacerdote"};

    public mostrarComponent () {
        mt = new mostrarTemplate(this);
        recursos = Recursos.getServicios();
        guardar = Guardar.getInstance();

        mostrarTabla();
    }

    public void presentar() {
        if (crearComponent == null) {
            crearComponent = new crearComponent();
            mt.setVisible(false);
            mt = null;
        }
    }

    public void mostrarTabla() {
        for (Personaje personaje : guardar.getMisPersoanjes()) {
            agregarRegistro(personaje);
        }
    }

    public void agregarRegistro(Personaje personaje) {
        mt.getModelo().addRow(new Object[] {
            personaje.getNombre(), personaje.raza(), clases[personaje.getClase()]
        });
    }

    public void repaintPersonaje(String raza, int clase) {
        mt.getlPersonaje().removeAll();
        switch (raza) {
            case "Draenei":
                if (clase == 1)
                    mt.getlPersonaje().setIcon(recursos.getDraenei_chaman());
                if (clase == 5)
                    mt.getlPersonaje().setIcon(recursos.getDraenei_sacerdote());
                break;
            case "Elfo":
                if (clase == 2)
                    mt.getlPersonaje().setIcon(recursos.getElfo_guerrero());
                if (clase == 4)
                    mt.getlPersonaje().setIcon(recursos.getElfo_picaro());
                break;
            case "Enano":
                if (clase == 1)
                    mt.getlPersonaje().setIcon(recursos.getEnano_chaman());
                if (clase == 3)
                    mt.getlPersonaje().setIcon(recursos.getEnano_paladin());
                break;
            case "Humano":
                if (clase == 2)
                    mt.getlPersonaje().setIcon(recursos.getHumano_guerreo());
                if (clase == 3)
                    mt.getlPersonaje().setIcon(recursos.getHumano_paladin());
                if (clase == 5)
                    mt.getlPersonaje().setIcon(recursos.getHumano_sacerdote());
                break;
            case "Orco":
                if (clase == 0)
                    mt.getlPersonaje().setIcon(recursos.getOrco_brujo());
                if (clase == 2)
                    mt.getlPersonaje().setIcon(recursos.getOrco_guerrero());
                if (clase == 4)
                    mt.getlPersonaje().setIcon(recursos.getOrco_picaro());
                break;
            case "Tauren":
                if (clase == 1)
                    mt.getlPersonaje().setIcon(recursos.getTauren_chaman());
                if (clase == 3)
                    mt.getlPersonaje().setIcon(recursos.getTauren_paladin());
                break;
            case "Troll":
                if (clase == 0)
                    mt.getlPersonaje().setIcon(recursos.getTroll_brujo());
                if (clase == 1)
                    mt.getlPersonaje().setIcon(recursos.getTroll_chaman());
                if (clase == 4)
                    mt.getlPersonaje().setIcon(recursos.getTroll_picaro());
                break;
            case "No-Muerto":
                if (clase == 0)
                    mt.getlPersonaje().setIcon(recursos.getUndead_brujo());
                if (clase == 4)
                    mt.getlPersonaje().setIcon(recursos.getUndead_picaro());
                break;
        }
        mt.repaint();
    }

    public void repaintMontura(int clase) {
        mt.getlMontura().removeAll();

        if (clase == 0) {
            mt.getlMontura().setIcon(recursos.getMontura_brujo());
        } else if (clase == 1) {
            mt.getlMontura().setIcon(recursos.getMontura_chaman());
        } else if (clase == 2) {
            mt.getlMontura().setIcon(recursos.getMontura_guerrero());
        } else if (clase == 3) {
            mt.getlMontura().setIcon(recursos.getMontura_paladin());
        } else if (clase == 4) {
            mt.getlMontura().setIcon(recursos.getMontura_picaro());
        } else if (clase == 5) {
            mt.getlMontura().setIcon(recursos.getMontura_sacerdote());
        }

        mt.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mt.getbCrear()) {
            presentar();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int fSelec = mt.getTabla().getSelectedRow();

        if (fSelec != -1){
            Personaje actual = guardar.getMisPersoanjes().get(fSelec);

            repaintPersonaje(actual.raza(),actual.getClase());
            repaintMontura(actual.getClase());
        } else {
            JOptionPane.showMessageDialog(null,"No hay datos de personajes");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
