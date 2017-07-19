/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.polymorphism3;

import grasp.polymorphism2.*;

/**
 *
 * @author fabricio
 */
public class Soma extends OperacaoMatematica {

    @Override
    public double calcular(double x, double y) throws Exception {
        return x + y;
    }
}
