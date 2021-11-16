package edu.depaul.cdm.se452.concept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.depaul.cdm.se452.concept.model.Records;
import edu.depaul.cdm.se452.concept.model.RecordsRepository;

@Controller
@RequestMapping("/academicrecords")
public class AcademicRecordsController {
    private RecordsRepository recordrepo;

    public AcademicRecordsController(RecordsRepository recordrepo){
        this.recordrepo = recordrepo;
    }

    @GetMapping
    public String showAcademicRecords(Model model) {
        Iterable<Records> records = recordrepo.findAll();
        records.forEach(recorditem -> System.out.println(recorditem.toString()));
        model.addAttribute("recordItems", records);
        return "academicrecords";
      }
  

}
