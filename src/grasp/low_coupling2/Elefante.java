/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.low_coupling2;

/**
 *
 * @author fabricio
 */
public class Elefante extends Animal {

    private String nome;

    public Elefante(String nome) {
        super(nome);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Elefante{" + "nome=" + nome + '}';
    }

}
