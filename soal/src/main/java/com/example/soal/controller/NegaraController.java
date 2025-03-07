package com.example.soal.controller;

import com.example.soal.model.entity.Negara;
import com.example.soal.service.NegaraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/negara")
@RequiredArgsConstructor
public class NegaraController {
    private final NegaraService negaraService;

    @GetMapping
    public ResponseEntity<List<Negara>> getAllNegara() {
        return ResponseEntity.ok(negaraService.getAllNegara());
    }
}

