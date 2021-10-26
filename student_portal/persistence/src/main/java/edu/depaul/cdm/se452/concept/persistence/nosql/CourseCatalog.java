package edu.depaul.cdm.se452.concept.persistence.nosql;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CourseCatalog")
public class CourseCatalog {
    @Id
	private String courseName;
	private String courseID;
	private String department;
	private Date startDate;
	private Date endDate;
	private int availableSeats;

}