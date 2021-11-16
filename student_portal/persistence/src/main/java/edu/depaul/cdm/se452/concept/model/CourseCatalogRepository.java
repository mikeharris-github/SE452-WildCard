package edu.depaul.cdm.se452.concept.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseCatalogRepository extends CrudRepository<CourseCatalog, String> {
}