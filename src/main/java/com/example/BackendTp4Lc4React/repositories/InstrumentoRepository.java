package com.example.BackendTp4Lc4React.repositories;

import com.example.BackendTp4Lc4React.entities.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento,Long> {
}
