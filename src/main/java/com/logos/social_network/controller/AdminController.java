package com.logos.social_network.controller;

import com.logos.social_network.entity.User;
import com.logos.social_network.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String userList(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "adminPage";
    }

    @PostMapping("/admin")
    public String deleteUser(@RequestParam Integer userId,
                             @RequestParam String action,
                             Model model){
        if (action.equals("delete")){
            userService.deleteUser(userId);
        }
        return "redirect:/adminPage";
    }
}
