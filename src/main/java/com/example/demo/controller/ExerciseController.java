package com.example.demo.controller;

import com.example.demo.dto.ExerciseDTO;
import com.example.demo.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by kwongiho on 2017. 5. 30..
 */
@RestController
public class ExerciseController {

    @Autowired
    ExerciseService exerciseServiceImpl;

    @RequestMapping(value="/get/exercise/resource" , method= RequestMethod.POST)
    public ExerciseDTO getByResource(HttpServletRequest request, HttpServletResponse response , @RequestBody int resource) {
        return exerciseServiceImpl.findByResource(resource);
    }

    @RequestMapping(value="/get/exercise/trainercode" , method= RequestMethod.POST)
    public ExerciseDTO getByTrainerCode(HttpServletRequest request, HttpServletResponse response , @RequestBody String trainerCode) {
        return exerciseServiceImpl.findByTrainerCode(trainerCode);
    }
    @RequestMapping(value="/get/exercise/target" , method= RequestMethod.POST)
    public ExerciseDTO getByTarget(HttpServletRequest request, HttpServletResponse response , @RequestBody int target) {
        return exerciseServiceImpl.findByTarget(target);
    }
    @RequestMapping(value="/get/exercise/exercisecode" , method= RequestMethod.POST)
    public ExerciseDTO getByExerciseCode(HttpServletRequest request, HttpServletResponse response , @RequestBody String exerciseCode) {
        return exerciseServiceImpl.findByExerciseCode(exerciseCode);
    }

    @RequestMapping(value="/get/all/exercise/exercisecode" , method= RequestMethod.POST)
    public List<ExerciseDTO> getAllByExerciseCode(HttpServletRequest request, HttpServletResponse response , @RequestBody String exerciseCode) {
        return exerciseServiceImpl.findAllByExerciseCode(exerciseCode);
    }

    @RequestMapping(value="/get/all/exercise/trainercode" , method= RequestMethod.POST)
    public List<ExerciseDTO> getAllByTrainerCode(HttpServletRequest request, HttpServletResponse response , @RequestBody String trainerCode) {
        return exerciseServiceImpl.findAllByTrainerCode(trainerCode);
    }

    @RequestMapping(value="/get/all/exercise/target" , method= RequestMethod.POST)
    public List<ExerciseDTO> getAllByTarget(HttpServletRequest request, HttpServletResponse response , @RequestBody int target) {
        return exerciseServiceImpl.findAllByTarget(target);
    }


    /*
    ExerciseDTO findByTrainerCode(String trainerCode);
    ExerciseDTO findByExerciseCode(String exerciseCode);
    ExerciseDTO findByTarget(int target);
    ExerciseDTO findByResource(int resource);

    List<ExerciseDTO> findAllByTrainerCodeAndTarget(String trainerCode,int target);
    List<ExerciseDTO> findAllByTrainerCode(String trainerCode);
    List<ExerciseDTO> findAllByTarget(int target);
     */
}
