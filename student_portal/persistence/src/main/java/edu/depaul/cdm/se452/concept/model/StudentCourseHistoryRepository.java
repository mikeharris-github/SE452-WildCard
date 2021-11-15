package edu.depaul.cdm.se452.concept.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * For Pagination and Other JPA functionality beyond base CRUD services
 * @see https://docs.spring.io/spring-data/data-jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 */
public interface StudentCourseHistoryRepository extends CrudRepository<StudentCourseHistory, Integer>  {

    @Query(
        value = "SELECT * from student_course_history where student_id = :student_id",
        nativeQuery = true)
    public List<StudentCourseHistory> findByStudentId(@Param("student_id") int student_id);
    
}
