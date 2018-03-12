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
    private Area area;
    private String nomeGrupo = "inexistente";

    public Grupo() {
        this.area = new Area();
    }

    public Grupo(int idGrupo, Area area, String nomeGrupo) {
        this.idGrupo = idGrupo;
        this.area = area;
        this.nomeGrupo = nomeGrupo;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    @Override
    public String toString() {
        return "idGrupo=" + idGrupo + ", area=" + area + ", nomeGrupo=" + nomeGrupo;
    }

}
