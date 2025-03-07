package com.example.soal.service.impl;

import com.example.soal.model.entity.Kota;
import com.example.soal.repository.KotaRepository;
import com.example.soal.service.KotaService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class KotaServiceImpl implements KotaService {

    private final KotaRepository kotaRepository;

    @Override
    public List<Kota> getKotaByProvinsi(String provinsiId) {
        return kotaRepository.findByProvinsiId(provinsiId) ;
    }
}
