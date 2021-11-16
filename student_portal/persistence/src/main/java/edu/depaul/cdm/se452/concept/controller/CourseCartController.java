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
  
    @GetMapping("/coursecatalog")
    public String showAvailableCourses(Model model) {
      Iterable<CourseCatalog> courses = repo.findAll();
      courses.forEach(course -> System.out.println(course.toString()));
      model.addAttribute("courses", courses);
      return "coursecatalog";
    }

    @PostMapping
    public String addToCart(@Valid CourseCart cart, BindingResult result, Model model){
      if (result.hasErrors()) {
        return "coursecart";
      }
  
      cartRepo.save(cart);
      model.addAttribute("students", repo.findAll());
      return "redirect:/manageclasses";
    }


    @RequestMapping(value="/add", method=RequestMethod.POST, params="action=cart") 
      public ModelAndView save(@Valid CourseCart cart, BindingResult result, Model model) {
          ModelAndView mv = new ModelAndView("coursecart");
          cartRepo.save(cart);
          Iterable<CourseCart> cartList = cartRepo.findAll();
          mv.addObject("cart", cartList);
          return mv;
      }


    // @RequestMapping(value="/edit", method=RequestMethod.POST, params="action=wishlist")
    //   public ModelAndView cancel() {}
    
}
