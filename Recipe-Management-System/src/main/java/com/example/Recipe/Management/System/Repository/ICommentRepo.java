package com.example.Recipe.Management.System.Repository;

import com.example.Recipe.Management.System.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepo extends JpaRepository<Comment, Integer> {
}
