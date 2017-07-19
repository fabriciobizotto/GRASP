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
public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void salvar(String nome) {
        this.controller.setModel(new Model(nome));
        this.controller.salvar(this);
    }

    public void imprimirDados() {
        System.out.println("Imprimindo dados do MODEL");
        for (Model model : Controller.getLista()) {
            System.out.println(model.getNome());
        }
        System.out.println("**********************************");
    }

}
