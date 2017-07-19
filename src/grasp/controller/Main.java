/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasp.controller;

/**
 *
 * @author fabricio
 */
public class Main {
    public static void main(String args[]){
        Controller controller = new Controller();
        View view = new View(controller);
        
        view.salvar("Roberto");
        view.salvar("Larissa");
        view.salvar("Geovani");
    }
}
