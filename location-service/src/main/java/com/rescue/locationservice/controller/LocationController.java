package com.rescue.locationservice.controller;

import com.rescue.locationservice.pojo.Location;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @GetMapping("/abc")
    public ResponseEntity<Boolean> isWorking() {
        return new ResponseEntity(true, HttpStatus.OK);
    }

    @GetMapping(value = "/get/{id}",
    produces = "application/json")
    public ResponseEntity<Location> getLocation(@RequestParam(name = "id") int id) {

    }

}
