package com.projectems.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;



@Data //Lombok's @Data annotation will automatically generate getters,and other necessary methods for you 

public class AdminDTO 
{
	private Long id;
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    @NotBlank
    private String username;
   
    @NotBlank
    private String password;
    
   
    
    @Email
    private String email;
	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	


			
	}
