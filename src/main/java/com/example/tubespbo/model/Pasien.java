package com.example.tubespbo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pasien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPasien;
    private String email;
    private String username;
    private String password;

    public Pasien() {
    }

    public Pasien(long idPasien, String email, String username, String password) {
        this.idPasien = idPasien;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public long getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(long idPasien) {
        this.idPasien = idPasien;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
