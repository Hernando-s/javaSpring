package com.hernando.javaSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernando.javaSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
