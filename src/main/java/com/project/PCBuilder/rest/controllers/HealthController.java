package com.project.PCBuilder.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/")
    public String root() {
        return "PC Builder API is running.";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
