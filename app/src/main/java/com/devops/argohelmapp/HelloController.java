package com.devops.argohelmapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "ArgoHelm DevOps Project 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "UPpppp";
    }

    @GetMapping("/version")
    public String version() {
        return "v2";
    }
}