package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "salaries")
public class Salaries {

    @Id
    private int emp_no;  // Primary Key
    private int salary;
    private String from_date;
    private String to_date;
}