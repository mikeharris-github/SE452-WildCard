package edu.depaul.cdm.se452.concept.model;

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
@Table(name="Records")
public class Records {
    @Id
    @GeneratedValue

    private long id;

    private String name;  
    private String dept; 
    private int num;
    private String term;
    private char grade;
    private int units;
    private char courseStatus;


    // // To display list of course for students, need to start session or fetch eager
    // @OneToMany   //(fetch = FetchType.EAGER)
    // @JoinTable
    // (
    //     name="COURSE_STUDENTS",
    //     joinColumns={ @JoinColumn(name="course_id", referencedColumnName="id")  }
    // )
    // @ToString.Exclude
    // private List<Student> students; 
}