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
@Document(collection = "CourseCatalog")
public class CourseCatalog {
    @Id
	private String courseName;
	private String courseID;
	private String department;
	private String startDate;
	private String endDate;
	private int availableSeats;
	private String term;



    /**
     * @return long return the id
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the id to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return String return the name
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * @param courseID the name to set
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * @return String return the dept
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param dept the dept to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return int return the num
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the num to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return String return the term
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the term to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return char return the grade
     */
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * @param availableSeats the grade to set
     */
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    /**
     * @return int return the units
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param units the units to set
     */
    public void setTerm(String term) {
        this.term = term;
    }


}