package com.example.tubespbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.tubespbo.model.JadwalKerja;
import com.example.tubespbo.repository.JadwalKerjaRepository;

@Controller
public class JadwalKerjaController {
    @Autowired
    private JadwalKerjaRepository jadwalKerjaRepository;

    @GetMapping("/pasienDash")
    public String getJadwalKerja(Model model) {
        List<JadwalKerja> jadwalKerjaList = jadwalKerjaRepository.findAll();
        model.addAttribute("jadwalKerjaList", jadwalKerjaList);
        return "pasienDash";
    }
}
