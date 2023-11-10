package com.projectems.service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.projectems.dto.ManagerDTO;
@Service
public interface ManagerService {
    ManagerDTO getManagerById(Long id);
    static ManagerDTO createManager(ManagerDTO managerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

    ManagerDTO updateManager(ManagerDTO managerDTO);
    void deleteManager(Long id);
    
    List<ManagerDTO> getAllManagers();
	static ManagerDTO save(ManagerDTO managerDTO) {
		// TODO Auto-generated method stub
		return null;
	}
}
