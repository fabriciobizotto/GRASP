/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private CalculadoraView tela;
    private CalculadoraModel modelo;

    public CalculadoraController(CalculadoraView tela, CalculadoraModel modelo) {
        this.tela = tela;
        this.modelo = modelo;

        this.tela.addCalculadoraListener(new CalculadoraListener(modelo, tela));
    }

}
