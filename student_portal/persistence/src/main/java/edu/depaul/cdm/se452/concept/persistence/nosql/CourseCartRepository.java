package edu.depaul.cdm.se452.concept.persistence.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseCartRepository extends MongoRepository<CourseReview, String> {

}