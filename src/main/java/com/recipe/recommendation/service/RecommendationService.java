package com.recipe.recommendation.service;
import com.recipe.recommendation.model.Recipe; import org.springframework.stereotype.Service; import java.util.*;
@Service public class RecommendationService {
 private final RecipeService recipes; public RecommendationService(RecipeService r){recipes=r;}
 public List<Recipe> recommend(String diet,String cuisine,Integer maxTime,String ingredient){
  return recipes.all().stream().filter(r->diet==null||diet.isBlank()||r.getDiet().equalsIgnoreCase(diet))
   .filter(r->cuisine==null||cuisine.isBlank()||r.getCuisine().equalsIgnoreCase(cuisine))
   .filter(r->maxTime==null||maxTime<=0||r.getCookingTime()<=maxTime)
   .filter(r->ingredient==null||ingredient.isBlank()||r.getIngredients().toLowerCase().contains(ingredient.toLowerCase()))
   .toList();
 }
}