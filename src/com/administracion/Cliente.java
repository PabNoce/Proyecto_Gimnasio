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

    private String status = "Cliente";
    private float suscripcion = (float) 29.99;
    private Grupo grupo1, grupo2, grupo3;

    public Cliente(int ID, String nome, String apellido) {
        super(ID, nome, apellido);
        this.grupo1 = new Grupo();
        this.grupo2 = new Grupo();
        this.grupo3 = new Grupo();
    }

    public float getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(float suscripcion) {
        this.suscripcion = suscripcion;
    }

    public Grupo getGrupo1() {
        return grupo1;
    }

    public void setGrupo1(Grupo grupo1) {
        this.grupo1 = grupo1;
    }

    public Grupo getGrupo2() {
        return grupo2;
    }

    public void setGrupo2(Grupo grupo2) {
        this.grupo2 = grupo2;
    }

    public Grupo getGrupo3() {
        return grupo3;
    }

    public void setGrupo3(Grupo grupo3) {
        this.grupo3 = grupo3;
    }

    @Override
    public String toString() {
        return super.toString() + ", status=" + status + ", suscripcion=" + suscripcion + ", grupo1=" + grupo1 + ", grupo2=" + grupo2 + ", grupo3=" + grupo3;
    }

}
