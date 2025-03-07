package com.example.soal.controller;


import com.example.soal.model.dto.request.MahasiswaRequest;
import com.example.soal.model.dto.response.MahasiswaResponse;
import com.example.soal.service.MahasiswaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mahasiswa")
@RequiredArgsConstructor
public class MahasiswaController {

    private final MahasiswaService mahasiswaService;

    @PostMapping
    public ResponseEntity<MahasiswaResponse> createMahasiswa(@RequestBody MahasiswaRequest request) {
        return ResponseEntity.ok(mahasiswaService.saveMahasiswa(request));
    }

    @GetMapping
    public ResponseEntity<Page<MahasiswaResponse>> getAllMahasiswa(Pageable pageable) {
        return ResponseEntity.ok(mahasiswaService.getAllMahasiswa(pageable));
    }
}

