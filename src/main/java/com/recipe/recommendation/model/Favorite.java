package com.recipe.recommendation.model;
import jakarta.persistence.*;
@Entity @Table(name="favorites",uniqueConstraints=@UniqueConstraint(columnNames={"user_id","recipe_id"}))
public class Favorite {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(name="user_id") private Long userId; @Column(name="recipe_id") private Long recipeId;
}