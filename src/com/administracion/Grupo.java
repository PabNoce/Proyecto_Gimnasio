/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.administracion;

/**
 *
 * @author pnocedalopez
 */
public class Grupo {

    private int idGrupo = 0;
    private String nomeGrupo = "inexistente";
    private int area = 0;
    private int monitor = 0;

    public Grupo() {
    }

    public Grupo(int idGrupo, String nomeGrupo) {
        this.idGrupo = idGrupo;
        this.nomeGrupo = nomeGrupo;
        
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "ID = " + idGrupo + ", nombre = " + nomeGrupo + ", area = " + area + ", monitor = " + monitor;
    }

}
