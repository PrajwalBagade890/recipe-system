package com.recipe.recommendation.service;
import com.recipe.recommendation.model.User; import com.recipe.recommendation.repository.UserRepository; import org.springframework.stereotype.Service;
@Service public class UserService { private final UserRepository repo; public UserService(UserRepository r){repo=r;} public User save(User u){return repo.save(u);} }