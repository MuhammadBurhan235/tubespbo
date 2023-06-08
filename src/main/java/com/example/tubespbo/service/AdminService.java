package com.example.tubespbo.service;

import com.example.tubespbo.util.BaseResponse;
import com.example.tubespbo.dto.request.LoginRequest;
import com.example.tubespbo.dto.request.SignupRequest;

public interface AdminService {
    boolean login(LoginRequest request, BaseResponse<String> baseResponse);
    boolean signup(SignupRequest request, BaseResponse<String> baseResponse);
}
