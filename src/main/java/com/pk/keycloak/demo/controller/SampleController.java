package com.pk.keycloak.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class SampleController {


    @GetMapping("/secured-with-role")
    ResponseEntity<String> withRole(){
        return new ResponseEntity("{\"body\":\"This request is secured with role\"}", HttpStatus.OK);
    }


    @GetMapping("/secured-without-role")
    ResponseEntity<String> withoutRole(){
        return new ResponseEntity("{\"body\":\"This request is secured without role\"}", HttpStatus.OK);
    }


    @GetMapping("")
    ResponseEntity<String> randomRoute(){
        return new ResponseEntity("{\"body\":\"anonymous route response.\"}", HttpStatus.OK);
    }

}
