package grasp.polymorphism2;

/**
 * Polimorfismo para calcular uma operação entre dois números. Semelhante ao
 * exemplo anterior, com alterações na classe OperacaoMatematica
 *
 * @author fabricio
 */
public class TesteCalculadora {

    public static void main(String args[]) {
        try {
            OperacaoMatematica soma = new Soma(10D, 10D);
            OperacaoMatematica subtracao = new Subtracao(10D, 10D);
            OperacaoMatematica multiplicacao = new Multiplicacao(10D, 10D);
            OperacaoMatematica divisao = new Divisao(10D, 10D);
            OperacaoMatematica divisaoPorZero = new Divisao(10D, 0D);
            
            soma.imprimirResultado(soma.calcular());
            subtracao.imprimirResultado(subtracao.calcular());
            multiplicacao.imprimirResultado(multiplicacao.calcular());
            divisao.imprimirResultado(divisao.calcular());
            divisaoPorZero.imprimirResultado(divisaoPorZero.calcular());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
