package com.benita.user.controller;

import com.benita.user.base.BaseController;
import com.benita.user.base.BaseResponse;
import com.benita.user.service.UserService;
import com.benita.user.wrapper.request.UserForm;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("users")
public class UserController extends BaseController {

    private final UserService userService;

    @PostMapping("/registerUser")
    public BaseResponse registerUser(@RequestBody UserForm userForm) {
        log.info("Executing registerUser() with : {}", userForm);
        return userService.registerUser(userForm);
    }

    @GetMapping(value="/search")
    public BaseResponse search(@RequestParam String email, @RequestParam String phone){
        log.info("search : {}, {}", phone, email);
        return userService.search(email, phone);
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("Hi there");
        return "SUCCESS";
    }
}
