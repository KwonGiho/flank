package com.example.demo.service;

import com.example.demo.dto.MuscleDTO;
import com.example.demo.repository.MuscleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
@Service(value="MuscleService")
public class MuscleServiceImpl implements MuscleService{

    @Autowired
    MuscleRepository muscleRepository;

    @Override
    public MuscleDTO insertMuscleDTO(MuscleDTO muscleDTO) {
        return muscleRepository.save(muscleDTO);
    }

    @Override
    public MuscleDTO insertMuscleDTO(String muscleName) {
        return null;
    }
}
