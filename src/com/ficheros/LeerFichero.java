/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficheros;

import com.administracion.Area;
import com.administracion.Cliente;
import com.administracion.Grupo;
import com.administracion.Monitor;
import com.metodos.Areas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class LeerFichero {

    File fich;
    Scanner sc;
    HashMap registroClientes = new HashMap();
    HashMap registroMonitores = new HashMap();
    HashMap registroGrupos = new HashMap();
    HashMap registroAreas = new HashMap();
    Monitor monitor;
    Cliente cliente;
    Grupo grupo;
    Area area;

    public void leerFicheroAreas() {
        fich = new File("Areas.txt");
        try {
            String linea;
            String[] lista = new String[2];
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                sc.nextLine();
                linea = sc.nextLine();
                lista = linea.split(",");
                area = new Area(Integer.parseInt(lista[0]), lista[1]);
                Areas.añadirArea(Integer.parseInt(lista[0]), area);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        sc.close();
    }

    public void leerFicheroGrupos() {
fich = new File("Grupos.txt");
        try {
            String linea;
            String[] lista = new String[4];
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                sc.nextLine();
                linea = sc.nextLine();
                lista = linea.split(",");
                grupo = new Grupo(Integer.parseInt(lista[0]), lista[1]);
               
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        sc.close();
    }

    public void leerFicheroPersonas() {

        fich = new File("Personas.txt");
        try {
            String linea;
            String[] lista = new String[7];
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                sc.nextLine();
                linea = sc.nextLine();
                lista = linea.split(",");

                if (lista[3].equalsIgnoreCase("monitor")) {
                    monitor = new Monitor(Integer.parseInt(lista[0]), lista[1]);
                    monitor.setSueldo(Float.parseFloat(lista[4]));
                    //monitor.setGrupo(lista[3]);
                    //registroMonitores.put(monitor.getID(),monitor.getNome(),monitor.getGrupo(),monitor.getSueldo());
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        sc.close();
    }

}
