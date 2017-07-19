/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.low_coupling;

/**
 * Forma errada
 *
 * @author fabricio
 */
public class LampadaErrado {

    public final static int OFF = 0;
    public final static int ON = 1;
    public final static int PISCAR = 2;

    public void setLampada(int valor) {
        if (valor == ON) {
            System.out.println("Ligar lampada");
        } else if (valor == OFF) {
            System.out.println("Desligar lampada");
        } else if (valor == PISCAR) {
            System.out.println("Piscar lampada");
        }
    }
}
