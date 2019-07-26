package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private UserService userService;

    //Home
    @RequestMapping("/")
    public String index(Model model){
        if(userService.getUser() != null) {
            model.addAttribute("user_id", userService.getUser().getId());
        }
        return "index";
    }


}
