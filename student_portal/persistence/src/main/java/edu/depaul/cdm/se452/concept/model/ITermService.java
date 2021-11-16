package edu.depaul.cdm.se452.concept.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ITermService {
    public List<Term> findAll();

    //public List<Term> findByStudentId(int studentId);
}