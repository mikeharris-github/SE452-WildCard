package edu.depaul.cdm.se452.concept.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IStudentService {
    public List<StudentCourseHistory> findAll();

    public List<StudentCourseHistory> findByStudentId(int studentId);
}