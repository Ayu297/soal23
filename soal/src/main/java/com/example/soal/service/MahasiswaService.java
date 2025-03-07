package com.example.soal.service;


import com.example.soal.model.dto.request.MahasiswaRequest;
import com.example.soal.model.dto.response.MahasiswaResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MahasiswaService {

    MahasiswaResponse saveMahasiswa(MahasiswaRequest request);
    Page<MahasiswaResponse> getAllMahasiswa(Pageable pageable);
}

