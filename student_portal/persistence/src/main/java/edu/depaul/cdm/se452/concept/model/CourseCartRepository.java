package edu.depaul.cdm.se452.concept.model;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface CourseCartRepository extends MongoRepository<CourseCart, String> {

}