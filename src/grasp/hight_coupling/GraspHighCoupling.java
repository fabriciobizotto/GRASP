/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.hight_coupling;

/**
 * Não é a melhor opção pois: <br />
 * Não é reutilizável <br />
 * Difícil de entender isoladamente <br />
 * Facilmente quebra se as classes forem alteradas <br />
 *
 * Utilizar Low Coupling (baixo acoplamento) ao invés disso.
 *
 * Como você irá fazer para adicionar uma giraffa utilizando este padrão? Terá
 * que alterar a classe.
 *
 * @author fabricio
 */
public class GraspHighCoupling {

    public static void main(String args[]) {
        Macaco macaco = new Macaco("Chita");
        Elefante elefante = new Elefante("Pardinho");

        Animais animais = new Animais(macaco, elefante);

        animais.mostrarAnimais();
    }
}
