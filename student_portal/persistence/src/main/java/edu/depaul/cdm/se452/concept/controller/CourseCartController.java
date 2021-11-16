package edu.depaul.cdm.se452.concept.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.depaul.cdm.se452.concept.model.CourseCart;
import edu.depaul.cdm.se452.concept.model.CourseCartRepository;
import edu.depaul.cdm.se452.concept.model.Term;


@Controller
@RequestMapping("/coursecart")
public class CourseCartController {
    private CourseCartRepository repo;
 
    public CourseCartController(CourseCartRepository repo){
      this.repo = repo;
    }
  
    @GetMapping
    public String showCart(Model model) {
      Iterable<CourseCart> cart = repo.findAll();
      cart.forEach(term_name -> System.out.println(term_name.toString()));
      model.addAttribute("cartItems", cart);
      return "coursecart";
    }
}
