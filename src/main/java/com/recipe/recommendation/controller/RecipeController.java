package com.recipe.recommendation.controller;
import com.recipe.recommendation.service.RecipeService; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/recipes") public class RecipeController{
 private final RecipeService service; public RecipeController(RecipeService s){service=s;}
 @GetMapping public String list(@RequestParam(required=false) String q,Model m){m.addAttribute("recipes",service.search(q));m.addAttribute("q",q);return "recipes/recipes";}
 @GetMapping("/{id}") public String detail(@PathVariable Long id,Model m){m.addAttribute("recipe",service.get(id).orElse(null));return "recipes/recipe-details";}
}