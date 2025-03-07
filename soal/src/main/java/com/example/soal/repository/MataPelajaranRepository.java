package com.example.soal.repository;

import com.example.StudentManagement.model.entity.MataPelajaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MataPelajaranRepository extends JpaRepository<MataPelajaran, String> {
}