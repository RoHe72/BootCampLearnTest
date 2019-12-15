package com.itf.leistungskontrolle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long empId;
	
	
	@NotNull
	@NotBlank
	@Column(nullable=false)
	private String name;
	
	
	
	
	@DecimalMin("1")
	@Column(nullable=false)
	private double salary;
	
	
	@NotNull
	@NotBlank
	@Column(nullable=false)
	private String department;
	
}
