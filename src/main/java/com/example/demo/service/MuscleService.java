package com.example.demo.service;

import com.example.demo.dto.MuscleDTO;
import org.springframework.stereotype.Service;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
public interface MuscleService {
    MuscleDTO insertMuscleDTO(MuscleDTO muscleDTO);
    MuscleDTO insertMuscleDTO(String muscleName);
}
