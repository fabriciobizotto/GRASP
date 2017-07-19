package grasp.polymorphism3;

import grasp.polymorphism2.*;

/**
 * Polimorfismo para calcular uma operação entre dois números
 *
 * @author fabricio
 */
public class TesteCalculadora {

    public static void main(String args[]) {
        try {
            OperacaoMatematica soma = new Soma();
            OperacaoMatematica subtracao = new Subtracao();
            OperacaoMatematica multiplicacao = new Multiplicacao();
            OperacaoMatematica divisao = new Divisao();

            soma.imprimirResultado(soma.calcular(10D, 10D));
            subtracao.imprimirResultado(subtracao.calcular(10D, 10D));
            multiplicacao.imprimirResultado(multiplicacao.calcular(10D, 10D));
            divisao.imprimirResultado(divisao.calcular(10D, 10D));
            divisao.imprimirResultado(divisao.calcular(10D, 0D));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
