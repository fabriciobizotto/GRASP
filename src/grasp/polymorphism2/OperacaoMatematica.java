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
public abstract class OperacaoMatematica {

    protected double x;
    protected double y;

    public OperacaoMatematica(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcular() throws Exception;

    public void imprimirResultado(double resultado) {
        System.out.println("Tipo da operação: " + this.getClass().getSimpleName());
        System.out.println("Resultado: " + resultado);
        System.out.println("*********************************************************");
    }
}
