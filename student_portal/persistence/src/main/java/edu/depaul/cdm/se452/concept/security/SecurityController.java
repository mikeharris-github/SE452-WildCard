package edu.depaul.cdm.se452.concept.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
    @GetMapping("/")
    public String homepage(){
        return "studentportal_homepage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }    
}
