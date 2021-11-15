package edu.depaul.cdm.se452.concept.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import edu.depaul.cdm.se452.concept.model.IStudentService;
import edu.depaul.cdm.se452.concept.model.StudentCourseHistory;
import edu.depaul.cdm.se452.concept.model.StudentCourseHistoryRepository;

@Controller
@RequestMapping("manageclasses")
public class ManageClassesController {

  @Autowired
  private IStudentService courseService;

  @GetMapping
  public ModelAndView showCourses() {
    ModelAndView mv = new ModelAndView("manageclasses");
    //mv.addObject("courses", courseService.findAll());
    List<StudentCourseHistory> courseList = courseService.findByStudentId(1234551);
    mv.addObject("courses", courseList);
    return mv;
  }

  @GetMapping("/findclasses")
  public String findclasses() {
      return "coursecart";
  }

  @GetMapping("/drop")
  public String dropclasses() {
      return "dropclass1";
  }

}