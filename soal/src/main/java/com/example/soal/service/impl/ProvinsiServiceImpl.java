package com.example.soal.service.impl;

import com.example.soal.model.entity.Provinsi;
import com.example.soal.repository.ProvinsiRepository;
import com.example.soal.service.ProvinsiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProvinsiServiceImpl implements ProvinsiService {
    private final ProvinsiRepository provinsiRepository;

    @Override
    public List<Provinsi> getProvinsiByNegara(String negaraId) {
        return provinsiRepository.findByNegaraId(negaraId);
    }
}
