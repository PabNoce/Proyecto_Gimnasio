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

  

}
