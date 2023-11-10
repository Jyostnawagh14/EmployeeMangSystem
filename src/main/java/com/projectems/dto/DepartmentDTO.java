package com.projectems.dto;

import lombok.Data;


import javax.validation.constraints.NotBlank;

@Data
public class DepartmentDTO {
	
	  private Long id;
	  public DepartmentDTO(Long long1, Object object) {
		// TODO Auto-generated constructor stub
	}

	 
	

	public void DepartmentDTO1(Long id2, Object name2) {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
    @NotBlank
    private String name;

    @NotBlank
    private String description;
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		
	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
