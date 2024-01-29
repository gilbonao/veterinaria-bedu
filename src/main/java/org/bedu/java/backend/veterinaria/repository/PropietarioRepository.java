package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Propietario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropietarioRepository extends CrudRepository<Propietario, Long> {

    List<Propietario> findAll();

}
