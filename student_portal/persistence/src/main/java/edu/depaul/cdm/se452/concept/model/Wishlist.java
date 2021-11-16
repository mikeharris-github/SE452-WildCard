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
@Document(collection = "Wishlist")
public class Wishlist {
    @Id
	private String course;
	private Date startdate;
	private Date enddate;
}