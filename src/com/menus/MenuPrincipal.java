/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menus;

import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class MenuPrincipal {
    
    public void menuPrincipal() {
        boolean repeat = true;
        do {
            int option = Integer.parseInt(JOptionPane.showInputDialog("1-Administrar Clientes.\n"
                    + "2-Administrar Monitores.\n"
                    + "3-Administrar Grupos.\n"
                    + "4-Cargar Datos.\n"
                    + "5-Guardar Datos.\n"
                    + "0-Salir."
            ));
            switch (option) {
                case 1:
                    option = Integer.parseInt(JOptionPane.showInputDialog("1-Administrar Clientes.\n"
                    + "2-Administrar Monitores.\n"
                    + "3-Administrar Grupos.\n"
                    + "4-Cargar Datos.\n"
                    + "5-Guardar Datos.\n"
                    + "0-Atrás."
            ));
                    break;
                case 2:
                    option = Integer.parseInt(JOptionPane.showInputDialog("1-Administrar Clientes.\n"
                    + "2-Administrar Monitores.\n"
                    + "3-Administrar Grupos.\n"
                    + "4-Cargar Datos.\n"
                    + "5-Guardar Datos.\n"
                    + "0-Atrás."
            ));
                    break;
                case 3:
                    option = Integer.parseInt(JOptionPane.showInputDialog("1-Administrar Clientes.\n"
                    + "2-Administrar Monitores.\n"
                    + "3-Administrar Grupos.\n"
                    + "4-Cargar Datos.\n"
                    + "5-Guardar Datos.\n"
                    + "0-Atrás."
            ));
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 0:
                    repeat=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, repeat);
                    break;
                
            }
        } while (repeat == true);
        
    }
}
