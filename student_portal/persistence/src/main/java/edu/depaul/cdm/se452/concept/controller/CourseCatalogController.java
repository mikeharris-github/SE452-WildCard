package edu.depaul.cdm.se452.concept.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.depaul.cdm.se452.concept.model.CourseCatalog;
import edu.depaul.cdm.se452.concept.model.CourseCatalogRepository;

@Controller
@RequestMapping("/coursecatalog")
public class CourseCatalogController {
    private CourseCatalogRepository courseCatRepo;

    public CourseCatalogController(CourseCatalogRepository courseCatRepo){
        this.courseCatRepo = courseCatRepo;
    }

    @GetMapping
    public String showCourseCatalog(Model model) {
        Iterable<CourseCatalog> courses = courseCatRepo.findAll();
        courses.forEach(courseItem -> System.out.println(courseItem.toString()));
        model.addAttribute("courseItems", courses);
        return "courseCatalog";
      }

    // @GetMapping("/coursecatalog")
    // public ModelAndView showGreeting() {
    //     ModelAndView mv = new ModelAndView("coursecatalog");
    //     // mv.addObject("name", "Hello SE352/452 from test");
    //     return mv;
    // } 
}
