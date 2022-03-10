package com.abrito10.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrito10.dsmovie.entities.Score;
import com.abrito10.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
