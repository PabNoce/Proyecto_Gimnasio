/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Grupo;
import com.administracion.Monitor;
import com.ficheros.Conexion;
import com.ficheros.EscribirFichero;
import static com.metodos.Areas.areas;
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
                if (grupos.get(key).getMonitor() == ID) {
                    grupos.get(key).setMonitor(0);
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

    public static void consulta(int ID) {
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

    public static void asignarGrupo(int ID, int idGrupo) {
        try {
            if (monitores.containsKey(ID)) {
                monitores.get(ID).setGrupo(idGrupo);
                monitores.get(ID).setSueldo(monitores.get(ID).getSueldo() + 250);
                grupos.get(idGrupo).setMonitor(monitores.get(ID).getID());
                JOptionPane.showMessageDialog(null, "Grupo asignado.");
            } else {
                JOptionPane.showMessageDialog(null, "La ID del grupo no es correcta.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }
    }

    public static void desasignarGrupo(int ID) {
       
        try {
            if (monitores.containsKey(ID)&&monitores.get(ID).getGrupo()!=0) {
                monitores.get(ID).setGrupo(0);
                monitores.get(ID).setSueldo(monitores.get(ID).getSueldo() - 250);
                JOptionPane.showMessageDialog(null, "Grupo desasignado.");
            } else {
                JOptionPane.showMessageDialog(null, "La ID del monitor no es correcta \no no tiene ningun grupo asignado.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }

    }
    public static void escribir() {
         for (int key : monitores.keySet()) {
          Conexion.guardarMonitores(monitores.get(key));
          }
    }

    public static HashMap<Integer, Monitor> getMonitores() {
        return monitores;
    }

    public static void setMonitores(HashMap<Integer, Monitor> monitores) {
        Monitores.monitores = monitores;
    }
    
}
