/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.proyecto.dto.ProyectoDto;
import org.proyecto.entity.Proyecto;

/**
 *
 * @author User
 */
@Mapper(componentModel = "spring", uses = {AreaMapper.class, PersonaMapper.class, ProcesoMapper.class})
public interface ProyectoMapper {
    ProyectoDto toDto(Proyecto proyecto);
    Proyecto toEntity(ProyectoDto dto);
    List<ProyectoDto> toDto(List<Proyecto> procesos);
    List<Proyecto> toEntity(List<ProyectoDto> procesos); 
    
}
