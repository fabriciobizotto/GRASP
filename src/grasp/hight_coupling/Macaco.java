/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.hight_coupling;

/**
 *
 * @author fabricio
 */
public class Macaco {

    private String nome;

    public Macaco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Macaco{" + "nome=" + nome + '}';
    }

}
