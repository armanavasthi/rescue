package com.rescue.requestservice.controller;

import com.rescue.requestservice.proxy.LocationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestController {
    @Autowired
    LocationProxy locationProxy;

    @GetMapping("/")
    public ResponseEntity<Boolean> isWorking() {

        Boolean response = locationProxy.retrieveisLocationWorking();
        return new ResponseEntity(response, HttpStatus.OK);

    }

}
