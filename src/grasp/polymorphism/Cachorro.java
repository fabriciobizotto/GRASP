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
public class Cachorro extends Animal {

    private String raca;

    public Cachorro() {
        super();
    }

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public void andar() {
        System.out.println("Cachorro andou!");
    }

    @Override
    public void falar() {
        System.out.println("AuAU!!!");

    }

    @Override
    public String toString() {
        return "Cachorro: " + "\n" + "Nome:" + getNome() + ", Raça:" + raca;
    }
}
