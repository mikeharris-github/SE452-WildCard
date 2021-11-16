package edu.depaul.cdm.se452.concept.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import edu.depaul.cdm.se452.concept.model.IStudentService;
import edu.depaul.cdm.se452.concept.model.ITermService;
import edu.depaul.cdm.se452.concept.model.StudentCourseHistory;
import edu.depaul.cdm.se452.concept.model.StudentCourseHistoryRepository;
import edu.depaul.cdm.se452.concept.model.Term;
import edu.depaul.cdm.se452.concept.model.TermRepository;
import edu.depaul.cdm.se452.concept.model.TermService;

@Controller
@RequestMapping("/manageclasses")
public class ManageClassesController {

  private StudentCourseHistoryRepository repo;
 
  public ManageClassesController(StudentCourseHistoryRepository repo){
    this.repo = repo;
  }

  @GetMapping
  public String showCourses(Model model) {
    List<StudentCourseHistory> courses = repo.findByStatus("E");
 //   courses.forEach(course -> System.out.println(course.toString()));
    model.addAttribute("courses", courses);
    return "manageclasses";
  }

  @GetMapping("/drop")
  public String dropclasses() {
      return "dropclass1";
  }

}