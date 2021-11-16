package edu.depaul.cdm.se452.concept.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * For Pagination and Other JPA functionality beyond base CRUD services
 * @see https://docs.spring.io/spring-data/data-jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 */
public interface RecordsRepository extends CrudRepository<Records, Long>  {

}
