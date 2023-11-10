package com.projectems.service;

import org.springframework.stereotype.Service;

import com.projectems.dto.SalaryDTO;
@Service
public interface SalaryService {
    SalaryDTO getSalaryById(Long id);
    SalaryDTO createSalary(SalaryDTO salaryDTO);
    SalaryDTO updateSalary(SalaryDTO salaryDTO);
    void deleteSalary(Long id);
}
