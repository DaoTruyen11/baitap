package com.app.MediQuirk.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class ErrorController{
    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }
}
