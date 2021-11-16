package edu.depaul.cdm.se452.concept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import edu.depaul.cdm.se452.concept.model.PersonalInformation;
import edu.depaul.cdm.se452.concept.model.PersonalInformationRepository;

@Controller
@RequestMapping("/personalinfo")
public class PersonalInfoController {
    private PersonalInformationRepository info;

    public PersonalInfoController(PersonalInformationRepository info){
        this.info = info;
    }

    @GetMapping
    public String showPersonalInformation(Model model) {
      Iterable<PersonalInformation> pinfo = info.findAll();
      pinfo.forEach(item -> System.out.println(item.toString()));
      model.addAttribute("pinfoItems", pinfo);
      return "mypersonalinfo";
    }

}
