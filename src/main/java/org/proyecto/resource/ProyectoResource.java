/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.resource;

import org.proyecto.dto.ProyectoDto;
import org.proyecto.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class ProyectoResource {
    @Autowired
    private ProyectoService service;
    @RequestMapping(value = "consultarProyecto", method = RequestMethod.GET)
    public ResponseEntity<?> consultarArea(){
        return new ResponseEntity<>(service.consultarProyectos(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "guardarProyecto", method = RequestMethod.POST)
    public ResponseEntity<?> guardarProyecto(@RequestBody ProyectoDto dto){
        return new ResponseEntity<>(service.guardarProyecto(dto), HttpStatus.OK);
    }
    
}
