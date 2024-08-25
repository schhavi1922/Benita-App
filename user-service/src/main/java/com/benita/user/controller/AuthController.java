package com.benita.user.controller;

import com.benita.user.base.BaseResponse;
import com.benita.user.entity.User;
import com.benita.user.service.AuthService;
import com.benita.user.wrapper.request.LoginForm;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public BaseResponse login(@RequestBody LoginForm loginForm) {
        return authService.login(loginForm);
    }

    @PostMapping("/logout")
    public BaseResponse logout(@RequestParam("token") String username) {
        return authService.logout(username);
    }
}
