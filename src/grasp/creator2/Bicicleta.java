/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.creator2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author fabricio
 */
public class Bicicleta {

    private Roda[] rodas;
    private Quadro quadro;

    //Não implementa o padrão creator
    public Bicicleta(Roda[] rodas, Quadro quadro) {
        this.rodas = rodas;
        this.quadro = quadro;
    }

    //Implementa o padrão creator
    public Bicicleta(int tamanhoRoda1, int tamanhoRoda2, int tamanhoQuadro) {
        this.rodas = new Roda[]{new Roda(tamanhoRoda1), new Roda(tamanhoRoda2)};
        this.quadro = new Quadro(tamanhoQuadro);
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "rodas=" + Arrays.asList(rodas).toString() + ", quadro=" + quadro.toString() + '}';
    }

}
