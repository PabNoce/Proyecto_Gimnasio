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
public class Area {

    private int idArea = 0;
    private String nomeArea = "inexistente";

    public Area() {
    }

    public Area(int idArea, String nomeArea) {
        this.idArea = idArea;
        this.nomeArea = nomeArea;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }

    @Override
    public String toString() {
        return "ID = " + idArea + ", nombre = " + nomeArea;
    }

}
