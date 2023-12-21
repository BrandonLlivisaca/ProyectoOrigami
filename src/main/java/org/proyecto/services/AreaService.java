/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.ArrayList;
import java.util.List;
import org.proyecto.dto.AreaDto;
import org.proyecto.entity.Area;
import org.proyecto.mappers.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.proyecto.repository.AreaRepository;

/**
 *
 * @author User
 */
@Service
public class AreaService {
    @Autowired
    private AreaRepository repository;
    @Autowired
    private AreaMapper areaMapper;
    
    public List<AreaDto> consultarAreas(){
        List<Area> areas = repository.findAll();
        //List<AreaDto> areasDtos = areaMapper.toDto(areas);
        /*List<AreaDto> areasDtos = new ArrayList<>();
        for(Area a : areas){
            AreaDto dto = new AreaDto();
            dto.setId(a.getId());
            dto.setDescripcion(a.getDescripcion());
            areasDtos.add(dto);
        }*/
        return areaMapper.toDto(areas);
    };
    
}
