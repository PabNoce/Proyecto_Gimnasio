/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Cliente;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Clientes {
   static HashMap<Integer,Cliente> clientes = new HashMap();
    static Cliente cliente;

    public static void añadirCliente(int ID, Cliente cliente) {
        clientes.put(ID, cliente);
    }

    public static void crearCliente(String nome) {
        int newID = 1;
        boolean creado = false;
        do {
            if (clientes.get(newID) != null) {
                newID = newID++;
            } else {
                cliente = new Cliente(newID, nome);
                clientes.put(newID, cliente);
                creado = true;
            }
        } while (creado == false);
    }
    public void consulta(int ID) {
        try {
            if (clientes.get(ID) != null) {
                JOptionPane.showMessageDialog(null, clientes.get(ID).toString());
            } else {
                JOptionPane.showMessageDialog(null, "La ID no es correcta.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }
    }
    public static void mostrarClientes() {

       for (int key : clientes.keySet()) {
           System.out.println(clientes.get(key).toString());
       }
    }
}
