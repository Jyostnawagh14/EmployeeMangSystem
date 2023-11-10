package com.projectems.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LeaveDTO {

    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    private Long employeeId; // Use the employee's ID to link to an employee

    @NotBlank
    private String reason;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;
	public void setEmployeeId(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public void setReason(Object reason2) {
		// TODO Auto-generated method stub
		
	}

	public void setStartDate(Object startDate2) {
		// TODO Auto-generated method stub
		
	}

	public Long getEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEndDate(Object endDate2) {
		// TODO Auto-generated method stub
		
	}

	public Object getReason() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getStartDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEndDate() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Short getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}
