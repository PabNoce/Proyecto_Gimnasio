/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Area;
import com.administracion.Grupo;
import static com.metodos.Areas.areas;
import static com.metodos.Clientes.clientes;
import static com.metodos.Monitores.monitores;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Grupos {

    static HashMap<Integer, Grupo> grupos = new HashMap();
    static Grupo grupo;

    public static void añadir(int idGrupo, Grupo grupo) {
        grupos.put(idGrupo, grupo);
    }

    public static void eliminar(int idGrupo) {

        if (grupos.containsKey(idGrupo)) {
            for (int key : monitores.keySet()) {
                if (monitores.get(key).getGrupo() == idGrupo) {
                    monitores.get(key).setGrupo(0);
                }
            }
            for (int key : clientes.keySet()) {
                if (clientes.get(key).getGrupo1() == idGrupo) {
                    clientes.get(key).setGrupo1(0);
                }
                if (clientes.get(key).getGrupo2() == idGrupo) {
                    clientes.get(key).setGrupo2(0);
                }
                if (clientes.get(key).getGrupo3() == idGrupo) {
                    clientes.get(key).setGrupo3(0);
                }
            }
            grupos.remove(idGrupo);
            JOptionPane.showMessageDialog(null, "Grupo " + idGrupo + " eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "La ID no es correcta.");
        }
    }

    public static void crear(String nombreGrupo) {
        int newID = 1;
        boolean creado = false;
        do {
            if (grupos.containsKey(newID)) {
                newID++;
            } else {
                grupo = new Grupo(newID, nombreGrupo);
                grupos.put(newID, grupo);
                creado = true;
            }
        } while (creado == false);
    }

    public static void consulta(int idGrupo) {
        try {
            if (grupos.containsKey(idGrupo)) {
                JOptionPane.showMessageDialog(null, grupos.get(idGrupo).toString());
                System.out.println("Lista de clientes:\n");
                for (int key : clientes.keySet()) {
                    if (clientes.get(key).getGrupo1() == idGrupo
                            || clientes.get(key).getGrupo2() == idGrupo
                            || clientes.get(key).getGrupo3() == idGrupo) {
                        System.out.println("ID: " + clientes.get(key).getID()
                                + " Nombre: " + clientes.get(key).getNome());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "La ID no es correcta.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }
    }

    public static void mostrarLista() {
        for (int key : grupos.keySet()) {
            System.out.println(grupos.get(key).toString());
        }
    }

    public static void asignarArea(int idGrupo, int idArea) {
        try {
            if (grupos.containsKey(idGrupo) || areas.containsKey(idArea)) {
                grupos.get(idGrupo).setArea(areas.get(idArea));
                JOptionPane.showMessageDialog(null, "Area asignada.");
            } else {
                JOptionPane.showMessageDialog(null, "El grupo o el area no existen.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error de entrada");
        }
    }
}
