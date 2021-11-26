package com.company.oauth2.controllers;

import com.company.oauth2.dtos.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class OAuth2Controller {

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal User user) {
        HashMap<Object, Object> data = new HashMap<>();
        data.put("profile", user);
        model.addAttribute("frontendData", data);
        return "home";
    }

    @GetMapping("/oauth2")
    public String authorized(Model model) {
        return "home";
    }

}
