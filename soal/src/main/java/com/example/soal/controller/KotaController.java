package com.example.soal.controller;

import com.example.soal.model.entity.Kota;
import com.example.soal.service.KotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kota")
@RequiredArgsConstructor
public class KotaController {
    private final KotaService kotaService;

    @GetMapping("/{provinsiId}")
    public ResponseEntity<List<Kota>> getKotaByProvinsi(@PathVariable String provinsiId) {
        return ResponseEntity.ok(kotaService.getKotaByProvinsi(provinsiId));
    }
}

