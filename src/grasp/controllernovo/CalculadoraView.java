package grasp.controller;

import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author fabricio
 */
public class CalculadoraView extends JFrame {

    private JTextField n1 = new JTextField(10);
    private JLabel labelSoma = new JLabel("+");
    private JTextField n2 = new JTextField(10);
    private JButton btnCalcular = new JButton("Calculate");
    private JTextField txtResultado = new JTextField(10);

    CalculadoraView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(n1);
        calcPanel.add(labelSoma);
        calcPanel.add(n2);
        calcPanel.add(btnCalcular);
        calcPanel.add(txtResultado);

        this.add(calcPanel);
    }

    public int getN1() {
        return Integer.parseInt(n1.getText());
    }

    public int getN2() {
        return Integer.parseInt(n2.getText());
    }

    public int getSolucao() {
        return Integer.parseInt(txtResultado.getText());
    }

    public void setSolucao(int solution) {
        txtResultado.setText(Integer.toString(solution));
    }

    void addCalculadoraListener(ActionListener listener) {
        btnCalcular.addActionListener(listener);
    }

    void mostrarErros(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
