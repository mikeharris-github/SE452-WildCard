package edu.depaul.cdm.se452.concept.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "PersonalInformation")
public class PersonalInformation {
    @Id
	private String name;
	private String dob;
	private String gender;
	private String address;
	private String city;
	private String state;
	private int zip_code;


}