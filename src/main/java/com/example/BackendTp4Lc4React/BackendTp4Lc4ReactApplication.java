package com.example.BackendTp4Lc4React;

import com.example.BackendTp4Lc4React.entities.Instrumento;
import com.example.BackendTp4Lc4React.repositories.InstrumentoRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

@SpringBootApplication
public class BackendTp4Lc4ReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendTp4Lc4ReactApplication.class, args);
		System.out.println("Estoy funcionando");

	}
}












