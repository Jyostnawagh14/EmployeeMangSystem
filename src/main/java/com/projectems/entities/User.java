package com.projectems.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_registration") 
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "username") // Corrected column names to follow naming conventions
    private String username;

    @NotBlank
    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Admin admin;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Manager manager;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Employee employee;

	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}

	public void setRole(Object role2) {
		// TODO Auto-generated method stub
		
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

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

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}

	public Short getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
