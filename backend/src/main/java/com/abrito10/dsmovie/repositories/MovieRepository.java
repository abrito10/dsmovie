package com.abrito10.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrito10.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
