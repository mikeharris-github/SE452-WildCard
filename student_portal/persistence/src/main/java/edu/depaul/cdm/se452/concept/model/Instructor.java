package edu.depaul.cdm.se452.concept.model;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * Demo of setting up collection
 */
@Data
@Entity
@Table(name="Instructor")
public class Instructor {
    @Id
    @GeneratedValue
    private long id;

    private int instructor_id;
    private String instructor_name;
    private String course;
    private String email;
    private String office;
    private Date start_date;
    private Date end_date;
    
}