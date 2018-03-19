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
public class Monitor extends Persona {

    private int idGrupo=0;// = new Grupo();
    private float sueldo = 850;

    public Monitor() {
    }

    public Monitor(int ID, String nome) {
        super(ID, nome);

    }

    public int getGrupo() {
        return idGrupo;
    }

    public void setGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", grupo = " + idGrupo + ", sueldo = " + sueldo;
    }

}
