/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * O polimorfismo é usado para manipular dinamicamente tipos de objeto
 * semelhantes. <br>
 *
 * Eliminar declaração condicional
 *
 * @author fabricio
 */
public class GraspPolymorfism {

    public static void main(String[] args) {
        List<Animal> listaAnimais = new ArrayList();

        Animal can = new Cachorro("Brisa", "Dogo");
        Animal ga = new Gato("Minino", "Blanco");
        listaAnimais.add(can);
        listaAnimais.add(ga);

        System.out.println("Dados dos Animais");
        System.out.println("============================================");
        for (Animal ani : listaAnimais) {
            System.out.println(ani.toString());
        }
        System.out.println("============================================");

        System.out.println("Dados dos Animais");
        System.out.println("============================================");
        for (Animal ani : listaAnimais) {
            ani.falar();

            //O animal deve andar, caso seja um cachorro
            if (ani instanceof Cachorro) {
                ((Cachorro) ani).andar();
            } else if (ani instanceof Gato) {
                ((Gato) ani).morder();
            }
        }
        System.out.println("Dados dos Animais");
        System.out.println("============================================");
        for (Animal ani : listaAnimais) {
            ani.falar();
        }
        System.out.println("============================================");

    }

}
