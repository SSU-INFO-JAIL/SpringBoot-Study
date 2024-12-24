package com.example.demo.service;

import com.example.demo.entity.Salaries;
import com.example.demo.repository.SalariesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalariesService {

    private final SalariesRepository salariesRepository;

    public SalariesService(SalariesRepository salariesRepository) {
        this.salariesRepository = salariesRepository;
    }

    public List<Salaries> getRandomSalaries(int count) {
        return salariesRepository.findRandomSalaries(count);
    }
}