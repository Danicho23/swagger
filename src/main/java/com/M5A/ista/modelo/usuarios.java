/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.M5a.ista.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    private String id;
    @Column
    private String nombres;
    @Column
    private String correo;
    @Column
    private String usuario;
    @Column
    private String password;
    @Column
    private String url;
    
    public usuarios() {
    }

    public usuarios(String id, String nombres, String correo, String usuario, String password, String url) {
        this.id = id;
        this.nombres = nombres;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "usuarios{" + "id=" + id + ", nombres=" + nombres + ", correo=" + correo + ", usuario=" + usuario + ", password=" + password + ", url=" + url + '}';
    }

    // modelo agregado
  

}
