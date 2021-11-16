package edu.depaul.cdm.se452.concept.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.cdm.se452.concept.model.Term;
import edu.depaul.cdm.se452.concept.model.TermRepository;

@Controller
@RequestMapping("/term")
public class TermController {
    private TermRepository repo;
 
    public TermController(TermRepository repo){
      this.repo = repo;
    }
  
    @GetMapping
    public String showTermsString(Model model) {
      Iterable<Term> terms = repo.findAll();
      terms.forEach(term_name -> System.out.println(term_name.toString()));
      model.addAttribute("terms", terms);
      return "term";
    }
}
