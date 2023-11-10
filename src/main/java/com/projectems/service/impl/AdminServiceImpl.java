package com.projectems.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.projectems.converter.AdminConverter;
import com.projectems.dao.AdminRepository;
import com.projectems.dto.AdminDTO;
import com.projectems.service.AdminService;
@ComponentScan
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;
    
    @Autowired
    private AdminConverter adminConverter;

    @Override
    public AdminDTO createAdmin(AdminDTO adminDTO) {
        com.projectems.entities.Admin admin = adminConverter.convertToAdminEntity(adminDTO);
        admin = adminRepository.save(admin);
        return adminConverter.convertToAdminDTO(admin);
    }

    @Override
    public AdminDTO getAdminById(Long id) {
        com.projectems.entities.Admin admin = adminRepository.findById(id).orElse(null);
        return adminConverter.convertToAdminDTO(admin);
    }

    @Override
    public AdminDTO updateAdmin(Long id, AdminDTO adminDTO) {
        com.projectems.entities.Admin admin = adminConverter.convertToAdminEntity(adminDTO);
        admin.setId(id);
        admin = adminRepository.save(admin);
        return adminConverter.convertToAdminDTO(admin);
    }

    @Override
    public String deleteAdmin(Long id) {
        adminRepository.deleteById(id);
        return "Admin with ID " + id + " has been deleted successfully.";
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        Collection<com.projectems.entities.Admin> admins = adminRepository.findAll();
        return adminConverter.convertToAdminDTOList(admins);
    }
}