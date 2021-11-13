package edu.depaul.cdm.se452.concept.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.depaul.cdm.se452.concept.model.IStudentAuthService;
import edu.depaul.cdm.se452.concept.model.StudentAuth;


@Controller
public class LogInController {

  @Autowired
  private IStudentAuthService studentAuthService;
  
  @PostMapping("/login")
  public String authenticate(@RequestParam("username") String username,
                         @RequestParam("password") String password) {
      System.out.println(username);
      System.out.println(password);
      if(studentAuthService.findByUsername(username) != null){
        return "redirect:/studentportal_homepage";
      }
      return "login";
  }


}