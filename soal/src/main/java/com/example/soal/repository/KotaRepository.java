package com.example.soal.repository;

import com.example.soal.model.entity.Kota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KotaRepository extends JpaRepository<Kota, String> {
    List<Kota> findByProvinsiId(String provinsiId);
}

