package com.example.soal.model.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MahasiswaRequest {
    private String name;
    private String kelas;
    private List<String> mataPelajaranIds;
}

