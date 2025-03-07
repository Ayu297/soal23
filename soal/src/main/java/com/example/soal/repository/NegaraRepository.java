package com.example.soal.repository;

import com.example.soal.model.entity.Negara;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NegaraRepository extends JpaRepository<Negara, String> {
}
