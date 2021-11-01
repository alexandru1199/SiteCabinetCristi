package com.cabinet.sitecabinet.repository;

import com.cabinet.sitecabinet.model.Angajat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AngajatRepo extends JpaRepository <Angajat,Long> {

    void deleteAngajatById(Long id);

    Optional<Angajat> findAngajatById(Long id);
}
