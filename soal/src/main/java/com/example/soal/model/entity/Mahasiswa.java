package com.example.soal.model.entity;


import com.example.soal.model.constant.Gender;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "kelas")
    private String kelas;

    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    private Gender gender;
}
