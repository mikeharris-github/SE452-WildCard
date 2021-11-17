package edu.depaul.cdm.se452.concept.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.depaul.cdm.se452.concept.model.Course;
import edu.depaul.cdm.se452.concept.model.CourseCart;
import edu.depaul.cdm.se452.concept.model.CourseCartRepository;
import edu.depaul.cdm.se452.concept.model.CourseCatalog;
import edu.depaul.cdm.se452.concept.model.CourseCatalogRepository;


@Controller
@RequestMapping("/coursecart")
public class CourseCartController {
    private CourseCatalogRepository repo;
 
    public CourseCartController(CourseCatalogRepository repo ){
      this.repo = repo ;
    }

    @Autowired
    private CourseCartRepository cartRepo;

    @GetMapping
    public String showCartItems(Model model) {
      Iterable<CourseCart> cart = cartRepo.findAll();
      cart.forEach(course -> System.out.println(course.toString()));
      model.addAttribute("cartItems", cart);
      return "coursecart";
    }

    @RequestMapping(value="/add", method=RequestMethod.POST, params="action=cart") 
      public String save(@RequestParam("name") String desc, Model model) {
        CourseCart add = new CourseCart();
        String course = null;
        String sd = null;
        String ed = null;

        List<CourseCatalog> courses = (List<CourseCatalog>) repo.findAll();

        for(int i = 0; i<courses.size(); i++){
          if(courses.get(i).getCourseName().equalsIgnoreCase(desc)){
            course = courses.get(i).getDepartment() + courses.get(i).getCourseID();
            sd = courses.get(i).getStartDate();
            ed = courses.get(i).getEndDate();
            add.setCourse(course);
            add.setDescription(desc);
            add.setStartdate(sd);
            add.setEnddate(ed);
            cartRepo.save(add);
          }
        }

        return "redirect:/coursecart";
      }

    @GetMapping("/empty")
    public String empty(Model model){
      cartRepo.deleteAll();
      return "redirect:/coursecart";
    }
    
}
