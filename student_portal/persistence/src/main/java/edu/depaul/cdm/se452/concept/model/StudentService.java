package edu.depaul.cdm.se452.concept.model;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "datasource", havingValue = "se452db")
public class StudentService implements IStudentService {

  @Autowired
  private StudentCourseHistoryRepository courseHistory;

  @Override
  public List<StudentCourseHistory> findAll() {
    return (List<StudentCourseHistory>) courseHistory.findAll();
  }

  public List<StudentCourseHistory> findByStudentId(int studentId) {
    return courseHistory.findByStudentId(studentId);
  }

  public List<StudentCourseHistory> findByStatus(String status){
    return courseHistory.findByStatus(status);
  }

}