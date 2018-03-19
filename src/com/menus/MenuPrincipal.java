/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menus;

import com.metodos.Areas;
import com.metodos.Clientes;
import com.metodos.Grupos;
import com.metodos.Monitores;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class MenuPrincipal {

    public static void menuPrincipal() {
        boolean repeat = true;
        int option, ID, idGrupo, idArea;
        String nome;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1-Administrar Clientes.\n"
                    + "2-Administrar Monitores.\n"
                    + "3-Administrar Grupos.\n"
                    + "4-Administrar Areas\n"
                    + "0-Salir."
            ));
            switch (option) {
                case 1:
                    do {
                        option = Integer.parseInt(JOptionPane.showInputDialog(""
                                + "1-Registrar nuevo cliente.\n"
                                + "2-Dar de baja un cliente.\n"
                                + "3-Mostrar un cliente.\n"
                                + "4-Mostrar lista de clientes.\n"
                                + "5-Apuntar cliente a un grupo.\n"
                                + "6-Desapuntar cliente de un grupo.\n"
                                + "0-Atrás."
                        ));
                        switch (option) {
                            case 1:
                                nome = JOptionPane.showInputDialog("Introduce nombre y apellidos del nuevo cliente: ");
                                Clientes.crear(nome);
                                break;
                            case 2:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del cliente a dar de baja: "));
                                Clientes.eliminar(ID);
                                break;
                            case 3:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del cliente a consultar: "));
                                Clientes.consulta(ID);
                                break;
                            case 4:
                                Clientes.mostrarLista();
                                break;
                            case 5:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del cliente: "));
                                idGrupo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del grupo al que deseas apuntarlo: "));
                                Clientes.asignarGrupo(ID, idGrupo);
                                break;
                            case 6:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del cliente: "));
                                idGrupo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del grupo del que deseas borrarlo: "));
                                Clientes.desasignarGrupo(ID, idGrupo);
                                break;
                            case 0:
                                repeat = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Introduce un comando valido");
                                break;
                        }
                    } while (repeat == true);
                    repeat = true;
                    break;
                case 2:
                    do {
                        option = Integer.parseInt(JOptionPane.showInputDialog("1-Contratar monitor.\n"
                                + "2-Despedir monitor.\n"
                                + "3-Mostrar un monitor.\n"
                                + "4-Mostrar lista de monitores.\n"
                                + "5-Asignar grupo a un monitor.\n"
                                + "6-Desasignar monitor de un grupo\n"
                                + "0-Atrás."
                        ));
                        switch (option) {
                            case 1:
                                nome = JOptionPane.showInputDialog("Introduce nombre y apellidos del nuevo monitor: ");
                                Monitores.crear(nome);
                                break;
                            case 2:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del monitor a despedir: "));
                                Monitores.eliminar(ID);
                                break;
                            case 3:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del monitor a consultar: "));
                                Monitores.consulta(ID);
                                break;
                            case 4:
                                Monitores.mostrarLista();
                                break;
                            case 5:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del monitor: "));
                                idGrupo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del grupo al que deseas asignarlo: "));
                                Monitores.asignarGrupo(ID, idGrupo);
                                break;
                            case 6:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del monitor: "));                              
                                Monitores.desasignarGrupo(ID);
                                break;
                            case 0:
                                repeat = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Introduce un comando valido");
                                break;
                        }
                    } while (repeat == true);
                    repeat = true;
                    break;

                case 3:
                    do {
                        option = Integer.parseInt(JOptionPane.showInputDialog("1-Crear grupo.\n"
                                + "2-Eliminar grupo.\n"
                                + "3-Consultar lista de alumnos de un grupo.\n"
                                + "4-Consultar lista de grupos.\n"
                                + "5-Designar un area para un grupo\n"
                                + "0-Atrás."
                        ));
                        switch (option) {
                            case 1:
                                nome = JOptionPane.showInputDialog("Introduce el nombre del nuevo grupo: ");
                                Grupos.crear(nome);
                                break;
                            case 2:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del grupo a borrar: "));
                                Grupos.eliminar(ID);
                                break;
                            case 3:
                                ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del grupo a consultar: "));
                                Grupos.consulta(ID);
                                break;
                            case 4:
                                Grupos.mostrarLista();
                                break;
                            case 5:
                                idGrupo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del grupo al que deseas asignar un area: "));
                                idArea = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del area: "));
                                Grupos.asignarArea(idGrupo, idArea);
                                break;
                            case 0:
                                repeat = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Introduce un comando valido");
                                break;
                        }
                    } while (repeat == true);
                    repeat = true;
                    break;
                case 4:
                    do {
                        option = Integer.parseInt(JOptionPane.showInputDialog("1-Registrar area.\n"
                                + "2-Eliminar area.\n"
                                + "3-Mostrar informacion de un area\n"
                                + "4-Mostrar lista de areas.\n"
                                + "0-Atrás."
                        ));
                        switch (option) {
                            case 1:
                                nome = JOptionPane.showInputDialog("Introduce el nombre de la nueva area: ");
                                Areas.crear(nome);
                                break;
                            case 2:
                                idArea = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del area: "));
                                Areas.eliminar(idArea);
                                break;
                            case 3:
                                idArea = Integer.parseInt(JOptionPane.showInputDialog("Introduce la ID del area: "));
                                Areas.consulta(idArea);
                                break;
                            case 4:
                                Areas.mostrarLista();
                                break;
                            case 0:
                                repeat = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Introduce un comando valido");
                                break;
                        }
                    } while (repeat == true);
                    repeat = true;
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Introduce un comando valido");
                    break;

            }
        } while (repeat == true);
    }
}
