/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo2_26_5_19;

import clases.metodos;
import proyectojuegos.Juegos2;

/**
 *
 * @author User
 */
public class ProyectoPoo2_26_5_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        metodos m = metodos.getInstance();
        m.set_Information();
        Juegos2 view = new Juegos2();
        view.setLocationRelativeTo(null);
        view.setVisible(true);  
    }
    
}
