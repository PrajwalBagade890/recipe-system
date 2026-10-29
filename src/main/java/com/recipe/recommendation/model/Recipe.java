package com.recipe.recommendation.model;
import jakarta.persistence.*;
@Entity
public class Recipe {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name,cuisine,diet; private Integer cookingTime; private String difficulty;
 @Column(columnDefinition="TEXT") private String ingredients;
 @Column(columnDefinition="TEXT") private String instructions;
 private String image;
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getCuisine(){return cuisine;} public String getDiet(){return diet;} public Integer getCookingTime(){return cookingTime;}
 public String getDifficulty(){return difficulty;} public String getIngredients(){return ingredients;} public String getInstructions(){return instructions;} public String getImage(){return image;}
}