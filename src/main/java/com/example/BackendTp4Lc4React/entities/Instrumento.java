package com.example.BackendTp4Lc4React.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "instrumento")
public class Instrumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String instrumento;

    private String marca;

    private String modelo;

    private String imagen;

    private Double precio;

    private String costoEnvio;

    private int cantidadVendida;

    private String descripcion;

}
