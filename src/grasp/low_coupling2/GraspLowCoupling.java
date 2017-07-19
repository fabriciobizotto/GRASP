/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.low_coupling2;


/**
 * Esta é a melhor opção pois: <br />
 * É reutilizável <br />
 * Facil de entender<br />
 * Podemos adicionar outros animais <br />
 *
 * @author fabricio
 */
public class GraspLowCoupling {

    public static void main(String args[]) {
        Animal macaco = new Macaco("Chita");
        Animal elefante = new Elefante("Pardinho");
        
        AnimalLista lista = new AnimalLista();
        lista.adicionarAnimal(macaco);
        lista.adicionarAnimal(elefante);
        
        lista.mostrarAnimais();

    }
}
