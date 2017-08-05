/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.controller;

/**
 *
 * @author fabricio
 */
public class CalculadoraModel {

    private int valor;

    public void somar(int n1, int n2) {
        valor = n1 + n2;
    }

    public int getValor() {
        return valor;

    }

}
