package com.example.soal.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MataPelajaranResponse {
    private String id;
    private String name;
    private String code;
    private Integer sks;
}