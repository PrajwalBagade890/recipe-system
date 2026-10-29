package com.recipe.recommendation.repository;
import com.recipe.recommendation.model.Recipe; import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface RecipeRepository extends JpaRepository<Recipe,Long>{
 List<Recipe> findByNameContainingIgnoreCase(String q);
 List<Recipe> findByDietIgnoreCase(String diet);
 List<Recipe> findByCuisineIgnoreCase(String cuisine);
}