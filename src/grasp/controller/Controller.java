/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabricio
 */
public class Controller implements Acoes {

    private Model model;
    private static List<Model> lista;

    public Controller() {
        lista = new ArrayList<>();
    }

    @Override
    public void salvar(View view) {
        lista.add(model);
        System.out.println("Salvo com sucesso!");
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public static List<Model> getLista() {
        return lista;
    }

    public static void setLista(List<Model> lista) {
        Controller.lista = lista;
    }

    @Override
    public void listar(View view) {
        view.imprimirDados();
    }

}
