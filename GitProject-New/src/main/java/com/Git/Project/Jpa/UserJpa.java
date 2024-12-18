package com.Git.Project.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Git.Project.Entity.User;

public interface UserJpa  extends JpaRepository<User , String>  {

}
