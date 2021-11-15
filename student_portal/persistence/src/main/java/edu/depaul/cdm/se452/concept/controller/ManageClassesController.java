package edu.depaul.cdm.se452.concept.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.depaul.cdm.se452.concept.model.StudentCourseHistoryRepository;

@Controller
@RequestMapping("manageclasses")
public class ManageClassesController {

  @Autowired
  private StudentCourseHistoryRepository courseService;

  @GetMapping
  public ModelAndView showCourses() {
    ModelAndView mv = new ModelAndView("manageclasses");
   // mv.addObject("courses", courseService.findAll());
    mv.addObject("courses", courseService.findByStudentId(1234551));
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