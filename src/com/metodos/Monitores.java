/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Monitor;
import static com.metodos.Grupos.grupos;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Monitores {

    static HashMap<Integer, Monitor> monitores = new HashMap();
    static Monitor monitor;

    public static void añadir(int ID, Monitor monitor) {
        monitores.put(ID, monitor);
    }

    public static void eliminar(int ID) {
        if (monitores.containsKey(ID)) {
            for (int key : grupos.keySet()) {
                if (grupos.get(key).getMonitor().getID() == ID) {
                    grupos.get(key).setMonitor(new Monitor());
                }
            }
            monitores.remove(ID);
            JOptionPane.showMessageDialog(null, "Monitor " + ID + " eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "La ID no es correcta.");
        }
    }

    public static void crear(String nome) {
        int newID = 1;
        boolean creado = false;
        do {
            if (monitores.containsKey(newID)) {
                newID++;
            } else {
                monitor = new Monitor(newID, nome);
                monitores.put(newID, monitor);
                creado = true;
            }
        } while (creado == false);
    }

    public void consulta(int ID) {
        try {
            if (monitores.containsKey(ID)) {
                JOptionPane.showMessageDialog(null, monitores.get(ID).toString());
            } else {
                JOptionPane.showMessageDialog(null, "La ID no es correcta.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }
    }

    public static void mostrarLista() {

        for (int key : monitores.keySet()) {
            System.out.println(monitores.get(key).toString());
        }
    }
}
