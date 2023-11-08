package com.d4rkr0n1n.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.java.Log;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.MessageFormat;
@RestController
@RequestMapping("/application")
@Log
public class ApplicationController {
    
    @Value("${key.something}")
    private String something;
    @RequestMapping("/hello")
    public ResponseEntity<String> hello() {
        try {
            log.info(something);
            return ResponseEntity.ok("Hello from " + InetAddress.getLocalHost().getHostName() + "!");
        } catch (UnknownHostException e) {
            log.severe(e.getMessage());
            log.info(e.getStackTrace().toString());
            String reason = MessageFormat.format("{message: {0} , exception: {1}}", e.getMessage(), e.getClass());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, reason, e);
        }
    }
}
