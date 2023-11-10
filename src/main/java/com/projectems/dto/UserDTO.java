package com.projectems.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;

@Data
public class UserDTO {
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
    private String role;
	public Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}

	public void setRole(Object role2) {
		// TODO Auto-generated method stub
		
	}

	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

   
}
