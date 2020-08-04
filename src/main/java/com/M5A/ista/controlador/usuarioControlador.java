/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.M5a.ista.controlador;

import com.M5a.ista.modelo.usuarios;
import com.M5a.ista.repository.usuarioRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping (path ="/api")
@ResponseBody
public class usuarioControlador {
    
    @Autowired
    usuarioRepository service;
    
    @GetMapping("/usuarios")
    public List<usuarios>getAllUsuarios (){
        System.out.println("todos los usarios.....");
        List <usuarios> usuarios = new ArrayList<>();
        service.findAll().forEach(usuarios::add);
        return usuarios;
    }
    
    @PostMapping(value = "/usuarios/create")
    public usuarios postUsuario(@RequestBody usuarios user){
        usuarios _usuarios = service.save(new usuarios(user.getId(),user.getNombres(),user.getCorreo(), user.getUsuario(), user.getPassword(), user.getUrl()));
    return _usuarios;
    }
}
