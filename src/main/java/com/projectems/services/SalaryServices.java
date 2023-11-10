package com.projectems.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectems.converter.SalaryConverter;
import com.projectems.dao.SalaryRepository;
import com.projectems.dto.SalaryDTO;
import com.projectems.entities.Salary;

@Service
public class SalaryServices {

    private final SalaryRepository salaryRepository;
    
    @Autowired
    private final SalaryConverter salaryConverter;

    @Autowired
    public SalaryServices(SalaryRepository salaryRepository, SalaryConverter salaryConverter) {
        this.salaryRepository = salaryRepository;
        this.salaryConverter = salaryConverter;
    }

    public Salary saveSalary(Salary salary) {
        return salaryRepository.save(salary);
    }

    public List<Salary> getAllSalaries() {
        return salaryRepository.findAll();
    }

    public Optional<Salary> getSalaryById(Long id) {
        return salaryRepository.findById(id);
    }

    public Salary updateSalary(Salary salary) {
        return salaryRepository.save(salary);
    }

    public void deleteSalary(Long id) {
        salaryRepository.deleteById(id);
    }

    public SalaryDTO getSalaryDTOById(Long id) {
        Optional<Salary> salary = salaryRepository.findById(id);
        return salary.map(salaryConverter::entityToDto).orElse(null);
    }

    public SalaryDTO createSalary(SalaryDTO salaryDTO) {
        Salary salary = salaryConverter.dtoToEntity(salaryDTO);
        salary = salaryRepository.save(salary);
        return salaryConverter.entityToDto(salary);
    }

    public SalaryDTO updateSalary(SalaryDTO salaryDTO) {
        Salary salary = salaryConverter.dtoToEntity(salaryDTO);
        salary.setId(salaryDTO.getId());
        salary = salaryRepository.save(salary);
        return salaryConverter.entityToDto(salary);
    }
}





