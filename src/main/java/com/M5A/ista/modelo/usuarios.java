/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.M5a.ista.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "usuarios")
public class usuarios {
 @Id
 @Column
 private int id;
 @Column
 private String nombres;
 @Column
 private String correo;
 @Column
 private String usuario;
 @Column
 private String password;

    public usuarios() {
    }

    public usuarios(int id, String usuario) {
        this.id = id;
        this.usuario = usuario;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "usuarios{" + "id=" + id + ", nombres=" + nombres + ", correo=" + correo + ", usuario=" + usuario + ", password=" + password + '}';
    }


}
    
