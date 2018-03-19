/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Monitor;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author pnocedalopez
 */
public class Monitores {
    static HashMap monitores = new HashMap();
    static Monitor monitor;

    public static void añadirMonitor(int ID, Monitor monitor) {
        monitores.put(ID, monitor);
    }

    public static void crearMonitor(String nome) {
        int newID = 1;
        boolean creado = false;
        do {
            if (monitores.get(newID) != null) {
                newID = newID++;
            } else {
                monitor = new Monitor(newID, nome);
                monitores.put(newID, monitor);
                creado = true;
            }
        } while (creado == false);
    }
    public static void mostrarMonitores() {

        Iterator itr = monitores.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println(monitores.get(key).toString());
        }
    }
}
