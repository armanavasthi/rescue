package com.rescue.locationservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {

    @GetMapping("/")
    public ResponseEntity<Boolean> isWorking() {
        return new ResponseEntity(true, HttpStatus.OK);
    }

}
