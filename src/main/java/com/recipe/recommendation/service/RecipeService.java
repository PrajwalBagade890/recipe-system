package com.recipe.recommendation.service;
import com.recipe.recommendation.model.Recipe; import com.recipe.recommendation.repository.RecipeRepository; import org.springframework.stereotype.Service; import java.util.*;
@Service public class RecipeService {
 private final RecipeRepository repo; public RecipeService(RecipeRepository r){repo=r;}
 public List<Recipe> all(){return repo.findAll();} public List<Recipe> search(String q){return q==null||q.isBlank()?all():repo.findByNameContainingIgnoreCase(q);}
 public Optional<Recipe> get(Long id){return repo.findById(id);}
}