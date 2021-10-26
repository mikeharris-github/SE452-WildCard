package edu.depaul.cdm.se452.concept.persistence.relational;

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
@Table(name="Term")
public class Term {
    @Id
    @GeneratedValue

    private long id;

    private String term_name;
    private char course_dept;
    private int course_num;

}