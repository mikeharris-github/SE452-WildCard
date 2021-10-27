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
@Document(collection = "CourseCart")
public class CourseCart {
    @Id
	private String course;
	private String description;
	private Date startdate;
	private Date enddate;
	
	//NEED FUNTION TO MODIFY THIS NUMBER
	private int availableSeats = 25;
}