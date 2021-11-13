package edu.depaul.cdm.se452.concept.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Data;

@Data
@Entity
@Table(name = "StudentAuth")
public class StudentAuth {
	@Id
	@GeneratedValue
	private long id;
	
	private	String username;
	private String password;
	private int student_id;
	private String first_name;
	private String last_name;
}