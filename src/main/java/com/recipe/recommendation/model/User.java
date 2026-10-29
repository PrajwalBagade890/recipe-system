package com.recipe.recommendation.model;
import jakarta.persistence.*;
@Entity
public class User {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name,email,password;
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getPassword(){return password;} public void setPassword(String v){password=v;}
}