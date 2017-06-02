package com.example.demo.service;

import com.example.demo.dto.ExerciseDTO;

import java.util.List;

/**
 * Created by kwongiho on 2017. 5. 30..
 */
public interface ExerciseService {
    ExerciseDTO findByTrainerCode(String trainerCode);
    ExerciseDTO findByExerciseCode(String exerciseCode);
    ExerciseDTO findByTarget(int target);
    ExerciseDTO findByResource(int resource);


    List<ExerciseDTO> findAllByExerciseCode(String exerciseCode);
    List<ExerciseDTO> findAllByTrainerCodeAndTarget(String trainerCode,int target);
    List<ExerciseDTO> findAllByTrainerCode(String trainerCode);
    List<ExerciseDTO> findAllByTarget(int target);
}
