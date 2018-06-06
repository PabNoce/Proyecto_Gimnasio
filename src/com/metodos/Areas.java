/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Area;
import com.ficheros.Conexion;
import com.ficheros.EscribirFichero;
import static com.metodos.Grupos.grupos;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Areas {

    static HashMap<Integer, Area> areas = new HashMap();

    static Area area;

    public static void añadir(int idArea, Area area) {
        areas.put(idArea, area);
    }

    public static void eliminar(int idArea) {
        if (areas.containsKey(idArea)) {
            for (int key : grupos.keySet()) {
                if (grupos.get(key).getArea() == idArea) {
                    grupos.get(key).setArea(0);
                }
            }
            areas.remove(idArea);
            JOptionPane.showMessageDialog(null, "Area " + idArea + " eliminada.");
        } else {
            JOptionPane.showMessageDialog(null, "La ID no es correcta.");
        }
    }

    public static void crear(String nombreArea) {
        int newID = 1;
        boolean creado = false;
        do {
            if (areas.containsKey(newID)) {
                newID++;

            } else {

                area = new Area(newID, nombreArea);
                areas.put(newID, area);
                creado = true;
            }
        } while (creado == false);
    }

    public static void consulta(int idArea) {
        try {
            if (areas.get(idArea) != null) {
                JOptionPane.showMessageDialog(null, areas.get(idArea).toString());
                System.out.println("Lista de grupos usando el area " + idArea + ":\n");
                for (int key : grupos.keySet()) {
                    if (grupos.get(key).getArea() == idArea) {
                        System.out.println("ID: " + grupos.get(key).getIdGrupo()
                                + "Nombre: " + grupos.get(key).getNomeGrupo());
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
        for (int key : areas.keySet()) {
            System.out.println(areas.get(key).toString());
        }
    }
    public static void escribir() {
          for (int key : areas.keySet()) {
          Conexion.guardarAreas(areas.get(key));
          }
    }
}
