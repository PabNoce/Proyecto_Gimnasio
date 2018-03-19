/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Area;
import java.util.HashMap;

/**
 *
 * @author pnocedalopez
 */
public class Areas {

    static HashMap areas = new HashMap();
    static Area area;

    public static void añadirArea(int ID, Area area) {
        areas.put(ID, area);
    }

    public static void crearArea(String nombreArea) {
        int newID = 1;
        boolean creado = false;
        do {
            if (areas.get(newID) != null) {
                newID = newID++;
            } else {
                area = new Area(newID, nombreArea);
                areas.put(newID, area);
                creado = true;
            }
        } while (creado == false);
    }
}
