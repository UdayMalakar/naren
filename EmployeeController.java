package com.example.practice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/tasks")
    @PreAuthorize("hasRole('EMPLOYEE')")
    public String tasks() {
        return "Employee ke tasks";
    }
}