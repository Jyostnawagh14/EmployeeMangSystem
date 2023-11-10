package com.projectems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projectems.dto.LeaveDTO;
@Service
public interface LeaveService {
    static LeaveDTO createLeave(LeaveDTO leaveDTO) {
		// TODO Auto-generated method stub
		return null;
	}
    LeaveDTO getLeaveById(Long id);
    LeaveDTO updateLeave(Long id, LeaveDTO leaveDTO);
    String deleteLeave(Long id);
    List<LeaveDTO> getAllLeaves();
}
