/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Grupo;
import java.util.HashMap;

/**
 *
 * @author pnocedalopez
 */
public class Grupos {

    static HashMap grupos = new HashMap();
    static Grupo grupo;

    public static void añadirGrupo(int ID, Grupo grupo) {
        grupos.put(ID, grupo);
    }

    public static void crearGrupo(String nombreGrupo) {
        int newID = 1;
        boolean creado = false;
        do {
            if (grupos.get(newID) != null) {
                newID = newID++;
            } else {
                grupo = new Grupo(newID, nombreGrupo);
                grupos.put(newID, grupo);
                creado = true;
            }
        } while (creado == false);
    }
}
