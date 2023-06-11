package com.example.tubespbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.tubespbo.model.JadwalPilihanPasien;
import com.example.tubespbo.service.JadwalPilihanPasienService;

@Controller
public class JadwalPilihanPasienController {

    private final JadwalPilihanPasienService jadwalPilihanPasienService;

    @Autowired
    public JadwalPilihanPasienController(JadwalPilihanPasienService jadwalPilihanPasienService) {
        this.jadwalPilihanPasienService = jadwalPilihanPasienService;
    }

    @PostMapping("/jadwal-pilihan-pasien")
    @ResponseBody
    public JadwalPilihanPasien saveJadwalPilihanPasien(@RequestBody JadwalPilihanPasien jadwalPilihanPasien) {
        return jadwalPilihanPasienService.saveJadwalPilihanPasien(jadwalPilihanPasien);
    }

    @GetMapping("/previewPilihan")
    public String previewPilihan(){
        return "previewPilihan";
    }
}

