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
import com.metodos.Clientes;
import com.metodos.Grupos;
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

    static Monitor monitor;
    static Cliente cliente;
    static Grupo grupo;
    static Area area;

    public static void leerFicheroAreas() {
        File fich = new File("Areas.txt");
        try {
            String linea;
            String[] lista = new String[2];
            Scanner sc = new Scanner(fich);
            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                lista = linea.split(",");
                area = new Area(Integer.parseInt(lista[0]), lista[1]);
                Areas.añadir(Integer.parseInt(lista[0]), area);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }

    public static void leerFicheroGrupos() {
        File fich = new File("Grupos.txt");
        try {
            String linea;
            String[] lista = new String[4];
            Scanner sc = new Scanner(fich);
            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                lista = linea.split(",");
                grupo = new Grupo(Integer.parseInt(lista[0]), lista[1]);
                grupo.setArea(Integer.parseInt(lista[2]));
                grupo.setMonitor(Integer.parseInt(lista[3]));
                Grupos.añadir(Integer.parseInt(lista[0]), grupo);

            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }

    public static void leerFicheroMonitores() {
        File fich = new File("Monitores.txt");
        try {
            String linea;
            String[] lista = new String[4];
            Scanner sc = new Scanner(fich);
            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                lista = linea.split(",");
                monitor = new Monitor(Integer.parseInt(lista[0]), lista[1]);
                monitor.setGrupo(Integer.parseInt(lista[2]));
                monitor.setSueldo(Float.parseFloat(lista[3]));
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }

    public static void leerFicheroClientes() {
        File fich = new File("Clientes.txt");
        try {
            String linea;
            String[] lista = new String[6];
            Scanner sc = new Scanner(fich);
            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                lista = linea.split(",");
                cliente = new Cliente(Integer.parseInt(lista[0]), lista[1]);
                cliente.setSuscripcion(Float.parseFloat(lista[2]));
                cliente.setGrupo1(Integer.parseInt(lista[3]));
                cliente.setGrupo2(Integer.parseInt(lista[4]));
                cliente.setGrupo3(Integer.parseInt(lista[5]));
                Clientes.añadir(Integer.parseInt(lista[0]), cliente);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }

    }
}
