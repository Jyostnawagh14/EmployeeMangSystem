package com.projectems.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.projectems.converter.DepartmentConverter;
import com.projectems.dao.DepartmentRepository;
import com.projectems.dto.DepartmentDTO;
import com.projectems.entities.Department;
import com.projectems.service.DepartmentService;
@ComponentScan
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentConverter departmentConverter;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository, DepartmentConverter departmentConverter) {
        this.departmentRepository = departmentRepository;
        this.departmentConverter = departmentConverter;
    }

    @Override
    public DepartmentDTO getDepartment(Long id) {
        Department department = departmentRepository.findById(id).orElse(null);
        return departmentConverter.entityToDto(department);
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();
        return departments.stream()
            .map(departmentConverter::entityToDto)
            .collect(Collectors.toList());
    }

    @Override
    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO) {
        // Convert the DTO to an entity
        Department department = new Department();
        department.setName(departmentDTO.getName());

        try {
            // Save the entity to the repository
            Department savedDepartment = departmentRepository.save(department);
            return new DepartmentDTO(savedDepartment.getId(), savedDepartment.getName());
        } catch (Exception e) {
            // Handle any exceptions, e.g., database errors
            // You can log the error or handle it as needed
            return null; // Or throw a custom exception
        }
    }

    @Override
    public DepartmentDTO updateDepartment(DepartmentDTO departmentDTO, Long id) {
        Department department = departmentConverter.dtoToEntity(departmentDTO);
        department.setId(id);
        department = departmentRepository.save(department);
        return departmentConverter.entityToDto(department);
    }

    @Override
    public String deleteDepartment(Long id) {
        if (departmentRepository.existsById(id)) {
            departmentRepository.deleteById(id);
            return "deleted";
        }
        return "not found";
    }

    @Override
    public String deleteAllDepartments() {
        departmentRepository.deleteAll();
        return "deleted";
    }
}
