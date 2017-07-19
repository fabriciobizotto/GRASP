/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.polymorphism2;

/**
 *
 * @author fabricio
 */
public class Soma extends OperacaoMatematica {

    public Soma(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcular() throws Exception {
        return x + y;
    }
}
