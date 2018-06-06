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
import com.metodos.Monitores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pnocedalopez
 */
public class Conexion {

    static Connection connect;

    public static void connect() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:basedatos.bd");
            if (connect != null) {
            }
        } catch (SQLException ex) {
            System.err.println("Error\n" + ex.getMessage());
        }
    }

    public static void close() {
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cargarAreas() {

        connect();
        ResultSet select = null;
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM area");
            select = statement.executeQuery();
            while (select.next()) {
                Area area = new Area(select.getInt("idArea"), select.getString("nomeArea"));
                Areas.añadir(area.getIdArea(), area);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void cargarGrupos() {

        connect();
        ResultSet select = null;
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM grupo");
            select = statement.executeQuery();
            while (select.next()) {
                Grupo grupo = new Grupo(select.getInt("idGrupo"), select.getString("nomeGrupo"));
                grupo.setArea(select.getInt("area"));
                grupo.setMonitor(select.getInt("monitor"));
                Grupos.añadir(grupo.getIdGrupo(), grupo);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void cargarMonitores() {

        connect();
        ResultSet select = null;
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM monitor");
            select = statement.executeQuery();
            while (select.next()) {
                Monitor monitor = new Monitor(select.getInt("ID"), select.getString("nome"));
                monitor.setGrupo(select.getInt("idGrupo"));
                monitor.setSueldo(select.getFloat("sueldo"));
                Monitores.añadir(monitor.getID(), monitor);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void cargarClientes() {

        connect();
        ResultSet select = null;
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM cliente");
            select = statement.executeQuery();
            while (select.next()) {
                Cliente cliente = new Cliente(select.getInt("ID"), select.getString("nome"));
                cliente.setSuscripcion(select.getFloat("suscripcion"));
                cliente.setGrupo1(select.getInt("idGrupo1"));
                cliente.setGrupo2(select.getInt("idGrupo2"));
                cliente.setGrupo3(select.getInt("idGrupo3"));
                Clientes.añadir(cliente.getID(), cliente);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void guardarAreas(Area area) {
        connect();
        try {
            PreparedStatement statement = connect.prepareStatement("insert into area (idArea, nomeArea) values (?,?)");
            statement.setString(1, String.valueOf(area.getIdArea()));
            statement.setString(2, area.getNomeArea());
            statement.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void guardarGrupos(Grupo grupo) {
        connect();
        try {
            PreparedStatement statement = connect.prepareStatement("insert into grupo (idGrupo, nomeGrupo, area, monitor) values (?,?,?,?)");
            statement.setString(1, String.valueOf(grupo.getIdGrupo()));
            statement.setString(2, grupo.getNomeGrupo());
            statement.setString(3, String.valueOf(grupo.getArea()));
            statement.setString(4, String.valueOf(grupo.getMonitor()));
            statement.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void guardarMonitores(Monitor monitor) {
        connect();
        try {
            PreparedStatement statement = connect.prepareStatement("insert into monitor (ID, nome, idGrupo, sueldo) values (?,?,?,?)");
            statement.setString(1, String.valueOf(monitor.getID()));
            statement.setString(2, monitor.getNome());
            statement.setString(3, String.valueOf(monitor.getGrupo()));
            statement.setString(4, String.valueOf(monitor.getSueldo()));
            statement.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void guardarClientes(Cliente cliente) {
        connect();
        try {
            PreparedStatement statement = connect.prepareStatement("insert into cliente (ID, nome, suscripcion, idGrupo1, idGrupo2, idGrupo3) values (?,?,?,?,?,?)");
            statement.setString(1, String.valueOf(cliente.getID()));
            statement.setString(2, cliente.getNome());
            statement.setString(3, String.valueOf(cliente.getSuscripcion()));
            statement.setString(4, String.valueOf(cliente.getGrupo1()));
            statement.setString(5, String.valueOf(cliente.getGrupo2()));
            statement.setString(6, String.valueOf(cliente.getGrupo3()));
            statement.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }

    public static void dropTables() {
        connect();
        PreparedStatement statement;
        try {
            statement = connect.prepareStatement("DELETE FROM area");
            statement.execute();
            statement = connect.prepareStatement("DELETE FROM grupo");
            statement.execute();
            statement = connect.prepareStatement("DELETE FROM monitor");
            statement.execute();
            statement = connect.prepareStatement("DELETE FROM cliente");
            statement.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        close();
    }
}
