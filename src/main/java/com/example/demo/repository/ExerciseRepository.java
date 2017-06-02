package com.example.demo.repository;

import com.example.demo.dto.ExerciseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by kwongiho on 2017. 5. 30..
 */
public interface ExerciseRepository extends JpaRepository<ExerciseDTO,String> {
    ExerciseDTO findByTrainerCode(String trainerCode);
    ExerciseDTO findByExerciseCode(String exerciseCode);
    ExerciseDTO findByTarget(int target);
    ExerciseDTO findByResource(int resource);

    //exerciseCode
    List<ExerciseDTO> findAllByTrainerCodeAndTarget(String trainerCode,int target);
    List<ExerciseDTO> findAllByExerciseCode(String exerciseCode);
    List<ExerciseDTO> findAllByTrainerCode(String trainerCode);
    List<ExerciseDTO> findAllByTarget(int target);
}
