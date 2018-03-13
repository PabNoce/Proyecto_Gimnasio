/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficheros;


import com.administracion.Monitor;
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
    PrintWriter escribir;
    
    HashMap registroClientes = new HashMap();
    HashMap registroMonitores = new HashMap();
    Monitor mon;
    
    
    public void leerFichero(){
    fich = new File("FicheroMonitor.txt");
    if(fich.exists()){
 
        String linea;
        String[] lista = new String [7];

        try{
            sc = new Scanner(new File("FicheroMonitor.txt"));
            while(sc.hasNextLine()){
                sc.nextLine();
                linea = sc.nextLine();
                lista = linea.split(",");
                
                if(lista[3].equalsIgnoreCase("monitor")){
                    mon = new Monitor(Integer.parseInt(lista[0]),lista[1]);
                    mon.setSueldo(Float.parseFloat(lista[4]));
//                    mon.setGrupo(lista[3]);
                 //   registroMonitores.put(mon.getID(),mon.getNome(),mon.getGrupo(),mon.getSueldo());
                }

            }
        }catch(FileNotFoundException ex){
            System.out.println("No se encuentra el archivo");
        }          
        sc.close();
    }
}
    
    public void escribirFichero(){

        try {
            fich = new File("Fichero.txt");
            escribir = new PrintWriter(fich);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        escribir.close();
    }
}
