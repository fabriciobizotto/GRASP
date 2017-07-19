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
public abstract class OperacaoMatematica {
    
    public abstract double calcular(double x, double y) throws Exception;

    public void imprimirResultado(double resultado) {
        System.out.println("Tipo da operação: " + this.getClass().getSimpleName());
        System.out.println("Resultado: " + resultado);
        System.out.println("*********************************************************");
    }
}
