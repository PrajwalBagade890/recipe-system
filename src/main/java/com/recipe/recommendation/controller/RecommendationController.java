package com.recipe.recommendation.controller;
import com.recipe.recommendation.service.RecommendationService; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.web.bind.annotation.*;
@Controller @RequestMapping("/recommend") public class RecommendationController{
 private final RecommendationService service; public RecommendationController(RecommendationService s){service=s;}
 @GetMapping public String form(){return "recommendation/recommendation-form";}
 @PostMapping public String result(@RequestParam(required=false) String diet,@RequestParam(required=false) String cuisine,@RequestParam(required=false) Integer maxTime,@RequestParam(required=false) String ingredient,Model m){
  m.addAttribute("recipes",service.recommend(diet,cuisine,maxTime,ingredient));return "recommendation/results";
 }
}