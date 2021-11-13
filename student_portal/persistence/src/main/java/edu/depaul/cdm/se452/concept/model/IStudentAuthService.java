package edu.depaul.cdm.se452.concept.model;

import org.springframework.stereotype.Service;

@Service
public interface IStudentAuthService {

     public StudentAuth findByUsername(String username);
    

    
}