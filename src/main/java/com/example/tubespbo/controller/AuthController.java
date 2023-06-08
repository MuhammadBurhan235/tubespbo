package com.example.tubespbo.controller;

import com.example.tubespbo.dto.request.LoginRequest;
import com.example.tubespbo.dto.request.SignupRequest;
import com.example.tubespbo.service.AdminService;
import com.example.tubespbo.service.PasienService;
import com.example.tubespbo.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private PasienService pasienService;

    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public String loginPage (Model model) {
        model.addAttribute("loginRequest", new LoginRequest());
        return "login";
    }

    @PostMapping("/login-request")
    public String login(@ModelAttribute LoginRequest loginRequest, Model model) {
        BaseResponse<String> baseResponse = new BaseResponse<>();
        if (pasienService.login(loginRequest, baseResponse)){
            return "redirect:/template/pasien";
        }else if(adminService.login(loginRequest, baseResponse)){
            return "redirect:/template/admin";
        }
        model.addAttribute("success", false);
        return "login";
    }

    @GetMapping("/signup")
    public String signupPage (Model model) {
        model.addAttribute("signupRequest", new SignupRequest());
        return "signup";
    }

    @PostMapping("/signup-request")
    public String signup(@ModelAttribute SignupRequest signupRequest, Model model) {
        BaseResponse<String> baseResponse = new BaseResponse<>();
        if (pasienService.signup(signupRequest, baseResponse)){
            return "redirect:/template/pasien";
        }else if (adminService.signup(signupRequest, baseResponse)){
            return "redirect:/template/admin";
        }
        model.addAttribute("success", false);
        return "signup";
    }
}