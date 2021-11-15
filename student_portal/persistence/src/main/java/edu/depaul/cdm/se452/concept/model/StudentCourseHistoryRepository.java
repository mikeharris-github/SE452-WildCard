package edu.depaul.cdm.se452.concept.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

/**
 * For Pagination and Other JPA functionality beyond base CRUD services
 * @see https://docs.spring.io/spring-data/data-jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 */
public interface StudentCourseHistoryRepository extends CrudRepository<StudentCourseHistory, Integer>  {
    List<StudentCourseHistory> findByStudentId(int studentId);
}
