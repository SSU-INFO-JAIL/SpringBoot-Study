package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "employees")
public class Employee {
    // Getters and Setters
    @Id
    private int emp_no;
    private String first_name;
    private String last_name;

}