package com.java.springboot.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Details")
public class StudentDetails {
	@Id
	private String name;
	private String stream;
	private int arrears;
	private double cgpa;

}
