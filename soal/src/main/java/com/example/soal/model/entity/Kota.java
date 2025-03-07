package com.example.soal.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="kota")
public class Kota {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "nama_kota")
    private String nama;

    @ManyToOne
    @JoinColumn(name = "provinsi_id", nullable = false)
    @JsonBackReference
    private Provinsi provinsi;
}
