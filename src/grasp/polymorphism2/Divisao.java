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
public class Divisao extends OperacaoMatematica {

    public Divisao(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcular() throws Exception {
        try {
            if (y == 0) {
                throw new ArithmeticException("Divisão por zero não pode ser efetuada!");
            }
            return x / y;
        } catch (ArithmeticException ex) {
            throw ex;
        }
    }

}
