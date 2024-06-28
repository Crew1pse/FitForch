package com.fitforch.project.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SneakersController {
    @GetMapping("/Main")
    public String Main(Model model) {
        return "Main";
    }
}
