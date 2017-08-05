/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fabricio
 */
class CalculadoraListener implements ActionListener {

    private CalculadoraModel modelo;
    private CalculadoraView tela;

    public CalculadoraListener(CalculadoraModel modelo, CalculadoraView tela) {
        this.modelo = modelo;
        this.tela = tela;
        
        this.tela.addCalculadoraListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            modelo.somar(tela.getN1(), tela.getN2());
            tela.setSolucao(modelo.getValor());
        } catch (NumberFormatException ex) {
            System.out.println(ex);
            tela.mostrarErros("Informe dois números inteiros!");
        }

    }

}
