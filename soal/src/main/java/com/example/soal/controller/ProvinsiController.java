package com.example.soal.controller;

import com.example.soal.model.entity.Provinsi;
import com.example.soal.service.ProvinsiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/provinsi")
@RequiredArgsConstructor
public class ProvinsiController {
    private final ProvinsiService provinsiService;

    @GetMapping("/{negaraId}")
    public ResponseEntity<List<Provinsi>> getProvinsiByNegara(@PathVariable String negaraId) {
        return ResponseEntity.ok(provinsiService.getProvinsiByNegara(negaraId));
    }
}
