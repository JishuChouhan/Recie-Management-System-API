package com.example.Recipe.Management.System.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Recipe{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @NotBlank
        private String name;

        @NotBlank
        private String ingredients;

        @NotBlank
        private String instructions;

        @JsonProperty(access = JsonProperty.Access.READ_ONLY)// It will hide timestamp in jason as we will set it to current time stamp when recipes will get created
        private LocalDateTime recipeCreationTimeStamp;

        @ManyToOne
        @JoinColumn(name = "user_id")
        User user;

        @OneToMany(mappedBy = "recipe")
        List<Comment> comments;
}
