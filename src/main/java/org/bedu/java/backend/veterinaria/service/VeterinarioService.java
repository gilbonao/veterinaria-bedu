package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.CreateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;
import org.bedu.java.backend.veterinaria.exception.VeterinarioNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.VeterinarioMapper;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {
    
    @Autowired
    private VeterinarioRepository repository;

    @Autowired
    private VeterinarioMapper mapper;

    public List<VeterinarioDTO> findAll(){
        return mapper.toDTO(repository.findAll());
    }

    public Optional<VeterinarioDTO> findById(Long id) {
        return repository.findById(id).map(mapper::toDTO);
    }

    public VeterinarioDTO save(CreateVeterinarioDTO data){
        Veterinario entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }

    public void update(Long veterinarioId, UpdateVeterinarioDTO data) throws VeterinarioNotFoundException {
        Optional<Veterinario> result = repository.findById(veterinarioId);

        if(!result.isPresent()){
            throw new VeterinarioNotFoundException(veterinarioId);
        }

        Veterinario veterinario = result.get();
        mapper.update(veterinario,data);
        repository.save(veterinario);
    }

    public void deleteById(Long id) throws VeterinarioNotFoundException {

        Optional<Veterinario> result = repository.findById(id);

        if(!result.isPresent()) {
            throw new VeterinarioNotFoundException(id);
        }

        repository.deleteById(id);
    }

}
