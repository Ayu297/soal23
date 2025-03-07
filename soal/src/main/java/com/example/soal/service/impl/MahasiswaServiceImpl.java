package com.example.soal.service.impl;


import com.example.soal.model.dto.request.MahasiswaRequest;
import com.example.soal.model.dto.response.MahasiswaResponse;
import com.example.soal.model.dto.response.MataPelajaranResponse;
import com.example.soal.model.entity.Mahasiswa;
import com.example.soal.model.entity.MataPelajaran;
import com.example.soal.repository.MahasiswaRepository;
import com.example.soal.repository.MataPelajaranRepository;
import com.example.soal.service.MahasiswaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class MahasiswaServiceImpl implements MahasiswaService {
        private final MahasiswaRepository mahasiswaRepository;
        private final MataPelajaranRepository mataPelajaranRepository;

        @Override
        public MahasiswaResponse saveMahasiswa(MahasiswaRequest request){

            List<MataPelajaran> mapelList = mataPelajaranRepository.findAllById(request.getMataPelajaranIds());


            Mahasiswa mahasiswa = Mahasiswa.builder()
                    .name(request.getName())
                    .kelas(request.getKelas())
                    .build();
            mahasiswaRepository.save(mahasiswa);


            List<MataPelajaranResponse> mataPelajaranList = mapelList.stream()
                    .map(mataPelajaran -> MataPelajaranResponse.builder()
                            .id(mataPelajaran.getId())
                            .name(mataPelajaran.getName())
                            .code(mataPelajaran.getCode())
                            .sks(mataPelajaran.getSks())
                            .build())
                    .collect(Collectors.toList());


            return MahasiswaResponse.builder()
                    .id(mahasiswa.getId())
                    .name(mahasiswa.getName())
                    .kelas(request.getKelas())
                    .mataPelajaran(mataPelajaranList)
                    .build();
        }

    @Override
    public Page<MahasiswaResponse> getAllMahasiswa(Pageable pageable) {
        Page<Mahasiswa> mahasiswaPage = mahasiswaRepository.findAll(pageable);

        List<MahasiswaResponse> mahasiswaResponses = mahasiswaPage.getContent()
                .stream()
                .map(mahasiswa -> MahasiswaResponse.builder()
                        .id(mahasiswa.getId())
                        .name(mahasiswa.getName())
                        .kelas(mahasiswa.getKelas()) // Ambil dari database
                        .mataPelajaran(new ArrayList<>()) // Kosong, kecuali ada cara untuk menghubungkan dengan mata pelajaran
                        .build())
                .collect(Collectors.toList());

        return new PageImpl<>(mahasiswaResponses, pageable, mahasiswaPage.getTotalElements());
    }
}

