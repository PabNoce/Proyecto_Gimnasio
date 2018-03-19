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
public class Cliente extends Persona {

    private float suscripcion = (float) 30;
    private int idGrupo1=0,/* = new Grupo(),*/ idGrupo2=0,/* = new Grupo()*/ idGrupo3=0; /*= new Grupo()*/

    public Cliente() {
    }

    public Cliente(int ID, String nome) {
        super(ID, nome);

    }

    public float getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(float suscripcion) {
        this.suscripcion = suscripcion;
    }

    public int getGrupo1() {
        return idGrupo1;
    }

    public void setGrupo1(int idGrupo1) {
        this.idGrupo1 = idGrupo1;
    }

    public int getGrupo2() {
        return idGrupo2;
    }

    public void setGrupo2(int idGrupo2) {
        this.idGrupo2 = idGrupo2;
    }

    public int getGrupo3() {
        return idGrupo3;
    }

    public void setGrupo3(int idGrupo3) {
        this.idGrupo3 = idGrupo3;
    }

    @Override
    public String toString() {
        return super.toString() + ", suscripcion = " + suscripcion + ", grupo 1 = " + idGrupo1 + ", grupo 2 = " + idGrupo2 + ", grupo 3 = " + idGrupo3;
    }

}
