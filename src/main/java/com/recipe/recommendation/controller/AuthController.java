package com.recipe.recommendation.controller;
import com.recipe.recommendation.model.User; import com.recipe.recommendation.service.UserService; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.web.bind.annotation.*;
@Controller public class AuthController{private final UserService service;public AuthController(UserService s){service=s;}
@GetMapping("/login") public String login(){return "auth/login";}@GetMapping("/register") public String reg(){return "auth/register";}
@PostMapping("/register") public String save(@ModelAttribute User u){service.save(u);return "redirect:/login";}}