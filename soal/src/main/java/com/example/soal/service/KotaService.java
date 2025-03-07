package com.example.soal.service;

import com.example.soal.model.entity.Kota;
import org.springframework.stereotype.Service;

import java.util.List;


public interface KotaService {
    List<Kota> getKotaByProvinsi(String provinsiId);
}
