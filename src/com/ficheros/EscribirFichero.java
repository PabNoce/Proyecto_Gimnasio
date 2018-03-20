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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author pnocedalopez
 */
public class EscribirFichero {

    public static void escribirFicheroAreas(HashMap<Integer, Area> areas) {
        File fich = new File("Areas.txt");
        try {

            PrintWriter escribir = new PrintWriter(fich);

            for (int key : areas.keySet()) {
                int id = areas.get(key).getIdArea();
                String nombre = areas.get(key).getNomeArea();
                escribir.println(id + "," + nombre);
            }

            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }

    public static void escribirFicheroGrupos(HashMap<Integer, Grupo> grupos) {
        File fich = new File("Grupos.txt");
        try {

            PrintWriter escribir = new PrintWriter(fich);

            for (int key : grupos.keySet()) {
                int id = grupos.get(key).getIdGrupo();
                String nombre = grupos.get(key).getNomeGrupo();
                int area = grupos.get(key).getArea();
                int monitor = grupos.get(key).getMonitor();
                escribir.println(id + "," + nombre + "," + area + "," + monitor);
            }

            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }

    public static void escribirFicheroMonitores(HashMap<Integer, Monitor> monitores) {
        File fich = new File("Monitores.txt");
        try {

            PrintWriter escribir = new PrintWriter(fich);

            for (int key : monitores.keySet()) {
                int id = monitores.get(key).getID();
                String nombre = monitores.get(key).getNome();
                int grupo = monitores.get(key).getGrupo();
                float sueldo = monitores.get(key).getSueldo();
                escribir.println(id + "," + nombre + "," + grupo + "," + sueldo);
            }

            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }

    public static void escribirFicheroClientes(HashMap<Integer, Cliente> clientes) {
        File fich = new File("Clientes.txt");
        try {

            PrintWriter escribir = new PrintWriter(fich);

            for (int key : clientes.keySet()) {
                int id = clientes.get(key).getID();
                String nombre = clientes.get(key).getNome();

                float suscr = clientes.get(key).getSuscripcion();
                int grupo1 = clientes.get(key).getGrupo1();
                int grupo2 = clientes.get(key).getGrupo2();
                int grupo3 = clientes.get(key).getGrupo3();
                escribir.println(id + "," + nombre + "," + suscr + "," + grupo1 + "," + grupo2 + "," + grupo3);
            }

            escribir.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }
}
