package com.example.soal.service;

import com.example.soal.model.entity.Provinsi;

import java.util.List;

public interface ProvinsiService {
    List<Provinsi> getProvinsiByNegara(String negaraId);
}
