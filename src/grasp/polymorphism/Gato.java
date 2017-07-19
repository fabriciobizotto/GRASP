/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.polymorphism;

/**
 *
 * @author fabricio
 */
public class Gato extends Animal {

    private String cor;

    @Override
    public void falar() {
        System.out.println("Miau! Miau!");
    }

    public void morder() {
        System.out.println("Mordi alguém!");
    }

    public Gato() {
        super();
    }

    public Gato(String cor, String nome) {
        super(nome);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato:" + "\n" + "Nome:" + getNome() + ", Cor:" + cor;
    }
}
