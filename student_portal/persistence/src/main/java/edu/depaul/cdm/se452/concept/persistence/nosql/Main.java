package edu.depaul.cdm.se452.concept.persistence.nosql;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  private static final Logger log = LoggerFactory.getLogger(Main.class);

  @Bean
  public CommandLineRunner saveCourseCart(CourseCartRepository repository) {
    return (args) -> {
      CourseCart course1 = new CourseCart();
      course1.setCourse("SE 400");
      course1.setDescription("This class will teach you about setting up a web app ;)");
      course1.setStartdate(Date.valueOf("09/01/2021"));
      course1.setEnddate(Date.valueOf("12/01/2021"));;
      repository.save(course1);

      CourseCart course2 = new CourseCart();
      course2.setCourse("CSC 400");
      repository.save(course2);  
    };
  }

  @Bean
  public CommandLineRunner showCourseReview(CourseCartRepository repository) {
    return (args) -> {
      List<CourseCart> courses = repository.findAll();
      for (CourseCart course : courses) {
        log.info(course.toString());
      }
    };
  }

}