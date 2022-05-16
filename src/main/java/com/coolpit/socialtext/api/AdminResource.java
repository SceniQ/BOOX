package com.coolpit.socialtext.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/")
@RequiredArgsConstructor
@Log4j2
public class AdminResource {

    @GetMapping(value = "welcome")
    public ResponseEntity<?> greet(){
        return ResponseEntity.ok("Welcome To Social Text!");
    }
}
