/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.low_coupling;

/**
 * Low Coupling: uma forma de fazer isso é decompor as ações em operações
 *
 * @author fabricio
 */
public class Main {

    public static void main(String args[]) {
        LampadaErrado l1 = new LampadaErrado();
        l1.setLampada(1);

        LampadaCerto l2 = new LampadaCerto();
        l2.ligar();
    }
}
