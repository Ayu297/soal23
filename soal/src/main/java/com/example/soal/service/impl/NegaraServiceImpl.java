package com.example.soal.service.impl;

import com.example.soal.model.entity.Negara;
import com.example.soal.repository.NegaraRepository;
import com.example.soal.service.NegaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NegaraServiceImpl implements NegaraService {
    private final NegaraRepository negaraRepository;

    @Override
    public List<Negara> getAllNegara() {
        return negaraRepository.findAll();
    }
}
