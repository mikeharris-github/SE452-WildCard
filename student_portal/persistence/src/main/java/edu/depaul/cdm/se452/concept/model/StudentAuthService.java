package edu.depaul.cdm.se452.concept.model;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "datasource", havingValue = "db")
public class StudentAuthService implements IStudentService {

  @Autowired
  private StudentAuthRepository repository;


  public Student findByStudentId(String username) {
    return repository.findByUsername(username).get(0);
  }


}