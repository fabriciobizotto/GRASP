/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.creator2;

/**
 * Toda bicicleta tem geralmente 1 quadro e duas rodas. Assim, a classe
 * bicicleta vai "criar" as rodas e o quadro.
 *
 * @author fabricio
 */
public class GraspCreator2 {

    public static void main(String args[]) {
        /*Não implementa o padrão*/
        Roda roda1 = new Roda(26);
        Roda roda2 = new Roda(26);
        Quadro quadro = new Quadro(70);
        Bicicleta b1 = new Bicicleta(new Roda[]{roda1, roda2}, quadro);
        System.out.println(b1.toString());

        /*Implementa o padrão*/
        Bicicleta b2 = new Bicicleta(26, 26, 70);
        System.out.println(b2.toString());
    }
}
