package com.example.BackendTp4Lc4React.services;

import com.example.BackendTp4Lc4React.entities.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstrumentoService {
    //Metodo para listar todos los registros
    public List<Instrumento> findAll() throws Exception;

    //Metodo para buscar un registro por id que le pasemos
    public Instrumento findById(Long id) throws Exception;


}
