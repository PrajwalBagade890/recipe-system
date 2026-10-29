package com.recipe.recommendation.controller;
import org.springframework.stereotype.Controller; import org.springframework.web.bind.annotation.GetMapping;
@Controller public class FavoriteController{@GetMapping("/favorites") public String favorites(){return "favorites/favorites";}}