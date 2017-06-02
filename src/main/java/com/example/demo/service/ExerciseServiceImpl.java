package com.example.demo.service;

import com.example.demo.dto.ExerciseDTO;
import com.example.demo.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kwongiho on 2017. 5. 30..
 */
@Service("ExerciseService")
public class ExerciseServiceImpl implements ExerciseService{

    @Autowired
    ExerciseRepository exerciseRepository;


    @Override
    public ExerciseDTO findByTrainerCode(String trainerCode) {
        return exerciseRepository.findByTrainerCode(trainerCode);
    }

    @Override
    public ExerciseDTO findByExerciseCode(String exerciseCode) {
        return exerciseRepository.findByExerciseCode(exerciseCode);
    }

    @Override
    public ExerciseDTO findByTarget(int target) {
        return exerciseRepository.findByTarget(target);
    }

    @Override
    public ExerciseDTO findByResource(int resource) {
        return exerciseRepository.findByResource(resource);
    }

    @Override
    public List<ExerciseDTO> findAllByTrainerCodeAndTarget(String trainerCode, int target) {
        return exerciseRepository.findAllByTrainerCodeAndTarget(trainerCode,target);
    }

    @Override
    public List<ExerciseDTO> findAllByTrainerCode(String trainerCode) {
        return exerciseRepository.findAllByTrainerCode(trainerCode);
    }

    @Override
    public List<ExerciseDTO> findAllByTarget(int target) {
        return exerciseRepository.findAllByTarget(target);
    }

    @Override
    public List<ExerciseDTO> findAllByExerciseCode(String exerciseCode) {
        return exerciseRepository.findAllByExerciseCode(exerciseCode);
    }
}
