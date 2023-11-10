package com.projectems.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ManagerDTO {
	
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
    
    @NotNull
    private Date joinDate;
	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}

	public void setJoinDate(Object joinDate2) {
		// TODO Auto-generated method stub
		
	}

	public static Object getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getJoinDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object toManager() {
		// TODO Auto-generated method stub
		return null;
	}
}