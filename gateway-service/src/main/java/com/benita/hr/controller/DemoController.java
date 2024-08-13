package com.benita.hr.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET, value = "/consume")
    public String getTokenDetails(@RequestHeader HttpHeaders headers) {
        return headers.toString();
    }

    @GetMapping
//    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "Hello from Spring boot & Keycloak";
    }

    @GetMapping("/hello-2")
//    @PreAuthorize("hasRole('ram')")
    public String hello2() {

        return "Hello from Spring boot & Keycloak - ADMIN";
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin(Principal principal) {
//        JwtAuthenticationToken token = (JwtAuthenticationToken) principal;
//        String userName = (String) token.getTokenAttributes().get("name");
//        String userEmail = (String) token.getTokenAttributes().get("email");
//        return ResponseEntity.ok("Hello Admin \nUser Name : " + userName + "\nUser Email : " + userEmail);
        return null;
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUser(Principal principal) {
//        JwtAuthenticationToken token = (JwtAuthenticationToken) principal;
//        String userName = (String) token.getTokenAttributes().get("name");
//        String userEmail = (String) token.getTokenAttributes().get("email");
//        return ResponseEntity.ok("Hello User \nUser Name : " + userName + "\nUser Email : " + userEmail);
        return null;
    }
}
