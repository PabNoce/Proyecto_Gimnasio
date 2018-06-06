/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metodos;

import com.administracion.Cliente;
import com.administracion.Grupo;
import com.ficheros.Conexion;
import com.ficheros.EscribirFichero;
import static com.metodos.Areas.areas;
import static com.metodos.Grupos.grupos;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Clientes {

    static HashMap<Integer, Cliente> clientes = new HashMap();
    static Cliente cliente;

    public static void añadir(int ID, Cliente cliente) {
        clientes.put(ID, cliente);
    }

    public static void eliminar(int ID) {
        if (clientes.containsKey(ID)) {
            clientes.remove(ID);
            JOptionPane.showMessageDialog(null, "Cliente " + ID + " " + clientes.get(ID).getNome() + " eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "La ID no es correcta.");
        }
    }

    public static void crear(String nome) {
        int newID = 1;
        boolean creado = false;
        do {
            if (clientes.containsKey(newID)) {
                newID++;
            } else {
                cliente = new Cliente(newID, nome);
                clientes.put(newID, cliente);
                creado = true;
            }
        } while (creado == false);
    }

    public static void consulta(int ID) {
        try {
            if (clientes.containsKey(ID)) {
                JOptionPane.showMessageDialog(null, clientes.get(ID).toString());
            } else {
                JOptionPane.showMessageDialog(null, "La ID no es correcta.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }
    }

    public static void mostrarLista() {
        for (int key : clientes.keySet()) {
            System.out.println(clientes.get(key).toString());
        }
    }

    public static void asignarGrupo(int ID, int idGrupo) {
        try {
            if (clientes.containsKey(ID) && grupos.containsKey(idGrupo)&&(clientes.get(ID).getGrupo1() != idGrupo
                            && clientes.get(ID).getGrupo2() != idGrupo
                            && clientes.get(ID).getGrupo3() != idGrupo)) {

                if (clientes.get(ID).getGrupo1() == 0) {
                    clientes.get(ID).setGrupo1(idGrupo);
                    clientes.get(ID).setSuscripcion(clientes.get(ID).getSuscripcion() + (float)5);
                    JOptionPane.showMessageDialog(null, "Grupo asignado.");
                } else {
                    if (clientes.get(ID).getGrupo2() == 0) {
                        clientes.get(ID).setGrupo2(idGrupo);
                        clientes.get(ID).setSuscripcion(clientes.get(ID).getSuscripcion() + (float)5);
                        JOptionPane.showMessageDialog(null, "Grupo asignado.");
                    } else {
                        if (clientes.get(ID).getGrupo3() == 0) {
                            clientes.get(ID).setGrupo3(idGrupo);
                            clientes.get(ID).setSuscripcion(clientes.get(ID).getSuscripcion() + (float)5);
                            JOptionPane.showMessageDialog(null, "Grupo asignado.");
                        } else {
                            JOptionPane.showMessageDialog(null, clientes.get(ID).getNome() + " no puede apuntarse en mas grupos.");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "La ID no es correcta o\n ya pertenece a ese grupo.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }
    }

    public static void desasignarGrupo(int ID, int idGrupo) {
        try {
            if (clientes.containsKey(ID)) {

                if (clientes.get(ID).getGrupo1() == idGrupo) {
                    clientes.get(ID).setGrupo1(0);
                    clientes.get(ID).setSuscripcion(clientes.get(ID).getSuscripcion() - 5);
                    JOptionPane.showMessageDialog(null, "Grupo desasignado.");
                } else {
                    if (clientes.get(ID).getGrupo2() == idGrupo) {
                        clientes.get(ID).setGrupo2(0);
                        clientes.get(ID).setSuscripcion(clientes.get(ID).getSuscripcion() - 5);
                        JOptionPane.showMessageDialog(null, "Grupo desasignado.");
                    } else {
                        if (clientes.get(ID).getGrupo3() == idGrupo) {
                            clientes.get(ID).setGrupo3(0);
                            clientes.get(ID).setSuscripcion(clientes.get(ID).getSuscripcion() - 5);
                            JOptionPane.showMessageDialog(null, "Grupo desasignado.");
                        } else {
                            JOptionPane.showMessageDialog(null, clientes.get(ID).getNome() + " no está apuntado en ese grupo");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "La ID no es correcta.");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "La lista no ha sido creada");
        }
    }
    public static void escribir() {
          for (int key : clientes.keySet()) {
          Conexion.guardarClientes(clientes.get(key));
          }
    }
}
