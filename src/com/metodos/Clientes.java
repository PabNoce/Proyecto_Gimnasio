/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Cliente;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author pnocedalopez
 */
public class Clientes {
    static HashMap clientes = new HashMap();
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
    public static void mostrarClientes() {

        Iterator itr = clientes.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println(clientes.get(key).toString());
        }
    }
}
