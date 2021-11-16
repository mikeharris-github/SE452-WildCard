package edu.depaul.cdm.se452.concept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.depaul.cdm.se452.concept.model.CourseCatalog;
import edu.depaul.cdm.se452.concept.model.CourseCatalogRepository;
import edu.depaul.cdm.se452.concept.model.PersonalInformation;
import edu.depaul.cdm.se452.concept.model.PersonalInformationRepository;


/**
 * Sample to demonstrate profile (application-dev vs application-prod)
 */    

@SpringBootApplication
public class Main {
    @Value( "${app.greeting}" )
    private String greeting;

    @Bean
    public CommandLineRunner showMessage() {
      return (args) -> {
        System.out.println(greeting);
      };
    }


    @Bean
    public CommandLineRunner savePersonalInformation(PersonalInformationRepository repository) {
      return (args) -> {
        PersonalInformation user1 = new PersonalInformation();
        user1.setName("Jim John");
        user1.setDob("05/01/1995");
        user1.setGender("male");
        user1.setAddress("111 main street");
        user1.setCity("chicago"); 
        user1.setState("IL");
        user1.setZip_code(60629);
        repository.save(user1);
      
        PersonalInformation user2 = new PersonalInformation();
        user2.setName("Sara OConnell");
        user2.setDob("03/11/1983");
        user2.setGender("female");
        user2.setAddress("17254 Pheasant Ct");
        user2.setCity("chicago"); 
        user2.setState("IL");
        user2.setZip_code(60629);
        repository.save(user2);
      };
  
    }

    @Bean
    public CommandLineRunner saveCourseCatalog(CourseCatalogRepository repository) {
      return (args) -> {
        CourseCatalog course1 = new CourseCatalog();
        course1.setCourseName("Computer Coding");
        course1.setCourseID("411");
        course1.setDepartment("CSC");
        course1.setStartDate("01/01/2022");
        course1.setEndDate("04/01/2022");
        course1.setAvailableSeats(200);
        course1.setTerm("2021-2022 Spring");
        repository.save(course1);
      
        CourseCatalog course2 = new CourseCatalog();
        course2.setCourseName("What even is ThymeLeaf");
        course2.setCourseID("500");
        course2.setDepartment("SE");
        course2.setStartDate("09/01/2020");
        course2.setEndDate("11/01/2020");
        course2.setAvailableSeats(30);
        course2.setTerm("2020-2021 Autumn");
        repository.save(course2);

      };
    }
  
  
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}