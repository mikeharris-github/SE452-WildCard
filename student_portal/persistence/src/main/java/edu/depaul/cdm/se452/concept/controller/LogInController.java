package edu.depaul.cdm.se452.concept.controller;



import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;



@Controller

public class LogInController {

@Value( "${spring.profiles.active}" )

private String login;



@PostMapping("/login")
public String test() {
  return "studentportal_homepage";
}

}




