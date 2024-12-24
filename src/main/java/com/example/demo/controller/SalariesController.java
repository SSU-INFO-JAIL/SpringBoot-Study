package com.example.demo.controller;

import com.example.demo.entity.Salaries;
import com.example.demo.service.SalariesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salaries")
public class SalariesController {

    private final SalariesService salariesService;

    public SalariesController(SalariesService salariesService) {
        this.salariesService = salariesService;
    }

    @GetMapping("/random")
    public List<Salaries> getRandomSalaries(@RequestParam(defaultValue = "10") int count) {
        return salariesService.getRandomSalaries(count);
    }
}