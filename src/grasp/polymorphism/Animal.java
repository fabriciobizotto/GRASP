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
public abstract class Animal {

    public abstract void falar();

    private String nome;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
