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
    private Area area=new Area();
    private Monitor monitor=new Monitor();
    private Cliente[] listaClientes=new Cliente[10];

  public Grupo() {
        for(int i=0;i<10;i++){
              listaClientes[i]=new Cliente();
        }
    }
  public Grupo(int idGrupo, String nomeGrupo){
      this.idGrupo=idGrupo;
      this.nomeGrupo=nomeGrupo;
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Cliente[] getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Cliente[] listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "ID=" + idGrupo + ", nombre =" + nomeGrupo + ", area=" + area.getIdArea() + ", monitor=" + monitor.getID();
    }
    

    

  

}
