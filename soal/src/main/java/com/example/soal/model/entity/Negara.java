package com.example.soal.model.entity;

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
@Table(name="negara")
public class Negara {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "nama_negara")
    private String nama;

    @OneToMany(mappedBy = "negara", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Provinsi> provinsi;



}
