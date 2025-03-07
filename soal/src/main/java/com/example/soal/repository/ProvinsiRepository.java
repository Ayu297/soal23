package com.example.soal.repository;

import com.example.soal.model.entity.Provinsi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinsiRepository extends JpaRepository<Provinsi, String> {
    List<Provinsi> findByNegaraId(String negaraId);
}

