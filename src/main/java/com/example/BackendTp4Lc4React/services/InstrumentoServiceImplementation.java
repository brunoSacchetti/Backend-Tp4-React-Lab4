package com.example.BackendTp4Lc4React.services;

import com.example.BackendTp4Lc4React.entities.Instrumento;
import com.example.BackendTp4Lc4React.repositories.InstrumentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstrumentoServiceImplementation implements InstrumentoService{

    @Autowired
    private InstrumentoRepository instrumentoRepository;
    @Override
    @Transactional
    public List<Instrumento> findAll() throws Exception {

        try{

            List<Instrumento> entities = instrumentoRepository.findAll();
            return entities;

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Instrumento findById(Long id) throws Exception {
        try{

            Optional<Instrumento> entityOptional = instrumentoRepository.findById(id);
            return entityOptional.get();

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
