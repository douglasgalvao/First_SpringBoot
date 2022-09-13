package com.spring.userDepartament.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	public User() {
	};

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public Department getDepartment() {
		return department;
	}	 

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
	}

	

	
}
