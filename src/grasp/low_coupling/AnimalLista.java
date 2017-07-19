/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.low_coupling;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabricio
 */
public class AnimalLista {

    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void mostrarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}
