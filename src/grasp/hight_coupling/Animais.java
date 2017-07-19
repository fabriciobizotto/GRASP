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
public class Animais {

    private Macaco macaco;
    private Elefante elefante;

    public Animais(Macaco macaco, Elefante elefante) {
        this.macaco = macaco;
        this.elefante = elefante;
    }

    public void mostrarAnimais() {
        System.out.println(macaco.toString());
        System.out.println(elefante.toString());
    }

}
