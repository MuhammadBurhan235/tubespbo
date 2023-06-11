package com.example.tubespbo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class JadwalPilihanPasien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String kodePerjanjian;
    private String department;
    private String tanggalKerja;
    private String namaDokter;
    private String jamKerja;
    private String emailPasien;

    public JadwalPilihanPasien(long id, String department, String tanggalKerja, String namaDokter, String jamKerja, String emailPasien) {
        this.id = id;
        this.kodePerjanjian = generateKodePerjanjian();
        this.department = department;
        this.tanggalKerja = tanggalKerja;
        this.namaDokter = namaDokter;
        this.jamKerja = jamKerja;
        this.emailPasien = emailPasien;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKodePerjanjian() {
        return kodePerjanjian;
    }

    public void setKodePerjanjian(String kodePerjanjian) {
        this.kodePerjanjian = kodePerjanjian;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTanggalKerja() {
        return tanggalKerja;
    }

    public void setTanggalKerja(String tanggalKerja) {
        this.tanggalKerja = tanggalKerja;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(String jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getEmailPasien() {
        return emailPasien;
    }

    public void setEmailPasien(String emailPasien) {
        this.emailPasien = emailPasien;
    }

    private String generateKodePerjanjian() {
        // Menggunakan UUID untuk menghasilkan kode unik secara acak
        String uuid = UUID.randomUUID().toString();
        // Ambil 8 karakter pertama dari UUID
        return uuid.substring(0, 8);
    }

}

