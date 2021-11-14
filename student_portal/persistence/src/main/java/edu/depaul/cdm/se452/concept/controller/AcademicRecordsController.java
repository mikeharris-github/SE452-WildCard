package edu.depaul.cdm.se452.concept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcademicRecordsController {
    @GetMapping("/academicrecords")
    public ModelAndView showRecords() {
        ModelAndView mv = new ModelAndView("AcademicRecords");
        return mv;
    } 

}
