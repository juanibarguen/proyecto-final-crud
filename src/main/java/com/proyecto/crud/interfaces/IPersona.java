package com.proyecto.crud.interfaces;

import com.proyecto.crud.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona,Integer> {
}
