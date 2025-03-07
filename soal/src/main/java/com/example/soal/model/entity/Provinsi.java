package com.example.soal.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="provinsi")
public class Provinsi {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "nama_provinsi")
    private String nama;

    @ManyToOne
    @JoinColumn(name = "negara_id", nullable = false)
    @JsonBackReference
    private Negara negara;

    @OneToMany(mappedBy = "provinsi", cascade = CascadeType.ALL, orphanRemoval = true) // ✅ mappedBy harus sesuai dengan nama properti di Kota
    @JsonManagedReference
    private List<Kota> kota;
}
