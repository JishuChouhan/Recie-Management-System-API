package com.example.Recipe.Management.System.Repository;

import com.example.Recipe.Management.System.Entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecipeRepo extends JpaRepository<Recipe , Integer> {
    Recipe findByName(String name);
}
