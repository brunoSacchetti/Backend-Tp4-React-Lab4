package com.example.BackendTp4Lc4React.controllers;

import com.example.BackendTp4Lc4React.entities.Instrumento;
import com.example.BackendTp4Lc4React.services.InstrumentoServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/instrumentos")
public class InstrumentoController {

    @Autowired
    private InstrumentoServiceImplementation instrumentoService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllInstruments(){
        try{

            return ResponseEntity.status(HttpStatus.OK).body(instrumentoService.findAll());

        }catch (Exception e){

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error");
        }

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getInstrumentById(@PathVariable Long id) {
        try{

            return ResponseEntity.status(HttpStatus.OK).body(instrumentoService.findById(id));

        }catch (Exception e){

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error");
        }

    }

}
