package com.projectems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projectems.dto.DepartmentDTO;
@Service
public interface DepartmentService {
    DepartmentDTO getDepartment(Long id);
    List<DepartmentDTO> getAllDepartments();
    DepartmentDTO createDepartment(DepartmentDTO departmentDTO);
    DepartmentDTO updateDepartment(DepartmentDTO departmentDTO, Long id);
    String deleteDepartment(Long id);
    String deleteAllDepartments();
}
