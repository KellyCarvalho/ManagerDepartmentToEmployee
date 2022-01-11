package com.devsuperior.bds03.entities;

import java.io.Serializable;

import javax.persistence.Column;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	@Column(unique=true)
	private String email;
	private String password;

}
