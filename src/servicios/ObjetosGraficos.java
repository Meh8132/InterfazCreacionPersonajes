package servicios;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.RectangularShape;
import java.awt.geom.RoundRectangle2D;

public class ObjetosGraficos {

    private static ObjetosGraficos servicio;
    private JPanel panel;
    private JLabel label;
    private JButton boton;
    private JTextField textField;
    private JComboBox comboBox;
    private JCheckBox check;
    private JRadioButton radioButton;
    private JScrollPane panelScroll;

    public ObjetosGraficos() {

    }

    public JScrollPane construirPanelBarra(
            Component componente, int x, int y, int ancho, int alto, Color colorFondo, Border borde
    ) {
        panelScroll = new JScrollPane(componente);
        panelScroll.setLocation(x, y);
        panelScroll.setSize(ancho, alto);
        panelScroll.getViewport().setBackground(colorFondo);
        panelScroll.setBorder(borde);
        return panelScroll;
    }

    public DefaultTableCellRenderer devolverTablaPersonalizada(
            Color colorPrincipal, Color colorSecundario, Color colorSeleccion, Color colorFuente, Font fuente
    ) {
        return new DefaultTableCellRenderer() {
            private static final long serialVersionUID = -8946942932242371111L;

            @Override
            public Component getTableCellRendererComponent(
                    JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column
            ) {
                JLabel celda = (JLabel) super.getTableCellRendererComponent(
                        table, value, isSelected, hasFocus, row, column
                );
                celda.setOpaque(true);
                celda.setFont(fuente);
                celda.setForeground(colorFuente);
                celda.setHorizontalAlignment(SwingConstants.CENTER);
                if (row % 2 != 0) celda.setBackground(colorPrincipal);
                else celda.setBackground(colorSecundario);
                if (isSelected) {
                    celda.setBackground(colorSeleccion);
                    celda.setForeground(Color.WHITE);
                }
                return celda;
            }
        };
    }

    public BasicScrollBarUI devolverScrollPersonalizado(
            int grosor, int radio, Color colorFondo, Color colorBarraNormal, Color colorBarraArrastrada
    ) {
        return new BasicScrollBarUI() {
            private Dimension d = new Dimension();

            @Override
            protected JButton createDecreaseButton(int orientation) {
                JButton boton = new JButton();
                boton.setPreferredSize(d);
                return boton;
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                JButton boton = new JButton();
                boton.setPreferredSize(d);
                return boton;
            }

            @Override
            protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
                g.setColor(colorFondo);
                g.fillRect(r.x, r.y, r.width, r.height);
            }

            @Override
            protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON
                );
                JScrollBar sb = (JScrollBar) c;
                if (!sb.isEnabled()) return;
                else if (isDragging) g2.setPaint(colorBarraArrastrada);
                else if (isThumbRollover()) g2.setPaint(colorBarraNormal);
                else g2.setPaint(colorBarraNormal);

                if (r.width < r.height) g2.fillRoundRect(
                        (r.width - grosor) / 2, r.y, grosor, r.height, radio, radio
                );
                else
                    g2.fillRoundRect(
                            r.x, (r.height - grosor) / 2, r.width, grosor, radio, radio
                    );
            }
        };
    }

    public JTextField buildJTextField(
            String txt,int x, int y, int ancho, int alto,String txtPosi,
            Color colorFondo, Color txtColor,Color colorCaret,
            Font fuente, Border borde
    ) {
        textField = new JTextField(txt);
        textField.setSize(ancho,alto);
        textField.setLocation(x, y);
        textField.setBackground(colorFondo);
        textField.setForeground(txtColor);
        textField.setCaretColor(colorCaret);
        textField.setFont(fuente);
        textField.setBorder(borde);

        switch (txtPosi){
            case "derecha": textField.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izquierda": textField.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": textField.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return textField;
    }

    public JPanel buildJPanel(int x, int y, int ancho, int alto, Color colorFondo, Border borde) {
        panel = new JPanel();
        panel.setBounds(x,y,ancho,alto);
        panel.setBackground(colorFondo);
        panel.setBorder(borde);
        panel.setLayout(null);
        return panel;
    }

    public JLabel buildJLabel(
            String txt, int x, int y, int ancho, int alto, String txtPosiX,String txtPosiY,
            ImageIcon imagen, Color colorFondo, Color txtColor,
            Font fuente, Border borde
    ) {
        label = new JLabel(txt);
        label.setBounds(x,y,ancho,alto);
        label.setBackground(colorFondo);
        label.setForeground(txtColor);
        label.setIcon(imagen);
        label.setFont(fuente);
        label.setBorder(borde);

        switch (txtPosiX){
            case "derecha": label.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izquierda": label.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": label.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        switch (txtPosiY){
            case "arriba": label.setVerticalAlignment(SwingConstants.TOP);
                break;
            case "abajo": label.setVerticalAlignment(SwingConstants.BOTTOM);
                break;
            case "centro": label.setVerticalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return label;
    }

    public JButton buildJButton(
            String txt, int x, int y, int ancho, int alto, String txtPosiX,String txtPosiY,
            ImageIcon imagen, Color colorFondo, Color txtColor,Cursor cursor,boolean area,
            Font fuente, Border borde
    ) {
        boton = new JButton(txt);
        boton.setBounds(x,y,ancho,alto);
        boton.setContentAreaFilled(area);
        boton.setFocusable(false);
        boton.setIcon(imagen);
        boton.setBackground(colorFondo);
        boton.setForeground(txtColor);
        boton.setCursor(cursor);
        boton.setFont(fuente);
        boton.setBorder(borde);

        switch (txtPosiX){
            case "derecha": boton.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izquierda": boton.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": boton.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        switch (txtPosiY){
            case "arriba": boton.setVerticalAlignment(SwingConstants.TOP);
                break;
            case "abajo": boton.setVerticalAlignment(SwingConstants.BOTTOM);
                break;
            case "centro": boton.setVerticalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return boton;
    }




    public static ObjetosGraficos getServicio() {
        if (servicio == null) {
            servicio = new ObjetosGraficos();
        }
        return servicio;
    }
}
