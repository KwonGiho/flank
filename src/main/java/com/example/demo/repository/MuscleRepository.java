package com.example.demo.repository;

import com.example.demo.dto.MuscleDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
public interface MuscleRepository extends JpaRepository<MuscleDTO,String> {
    //MuscleDTO findByMuscleName(String muscleName);
}
