/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_gimnasio;

import com.metodos.Areas;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Proyecto_Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          JOptionPane.showMessageDialog(null, "Holaaa");
        Areas.crear("Gimnasio");
        Areas.crear("Gimnasio2");
        JOptionPane.showMessageDialog(null, "Holaaa");
        System.out.println("Holaaa");
        Areas.mostrarLista();
        System.out.println("adios");
    }
    
}
