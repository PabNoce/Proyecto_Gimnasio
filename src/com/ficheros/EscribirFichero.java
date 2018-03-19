/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author pnocedalopez
 */
public class EscribirFichero {

    File fich;
    PrintWriter escribir;

    public void escribirFichero() {

        try {
            fich = new File("Fichero.txt");
            escribir = new PrintWriter(fich);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        escribir.close();
    }
}
