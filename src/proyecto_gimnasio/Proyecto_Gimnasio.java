/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_gimnasio;

import com.ficheros.Conexion;
import com.ficheros.EscribirFichero;
import com.ficheros.LeerFichero;
import com.menus.Menu;
import com.menus.MenuPrincipal;
import com.metodos.Areas;
import com.metodos.Clientes;
import com.metodos.Grupos;
import com.metodos.Monitores;
import javax.swing.JOptionPane;

/**
 *
 * @author pnocedalopez
 */
public class Proyecto_Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Leer ficheros
        //LeerFichero.leerFicheroAreas();
        //LeerFichero.leerFicheroGrupos();
        //LeerFichero.leerFicheroMonitores();
        //LeerFichero.leerFicheroClientes();
        //leer ficheros
        //Cargar base de datos
        Conexion.cargarAreas();
        Conexion.cargarGrupos();
        Conexion.cargarMonitores();
        Conexion.cargarClientes();
        //Cargar base de datos

        Menu m = new Menu();
        //MenuPrincipal.menuPrincipal();

        //Guardar base de datos
        Conexion.dropTables();
        Areas.escribir();
        Grupos.escribir();
        Monitores.escribir();
        Clientes.escribir();
        //Guardar base de datos

    }

}
