package com.example.soal.service;


import com.example.soal.model.entity.MataPelajaran;

import java.util.List;

public interface MataPelajaranService {
    List<MataPelajaran> getAllMataPelajaran();
    MataPelajaran getMataPelajaranById(Long id);
    MataPelajaran saveMataPelajaran(MataPelajaran mataPelajaran);
    MataPelajaran updateMataPelajaran(Long id, MataPelajaran mataPelajaran);
    void deleteMataPelajaran(Long id);
}

