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
public class Persona {

    private int ID=0;
    private String nome="no asignado", apelido="";

    public Persona() {
    }

    public Persona(int ID, String nome, String apellido) {
        this.ID = ID;
        this.nome = nome;
        this.apelido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", nome=" + nome + ", apelido=" + apelido;
    }

}
