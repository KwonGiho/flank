package com.example.demo.controller;

import com.example.demo.dto.MuscleDTO;
import com.example.demo.service.MuscleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
@RestController
public class MuscleController {

    @Autowired
    MuscleService muscleServiceImpl;

    /**
     * not implements now.
     * @param request
     * @param response
     * @param muscleDTO
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/musclename" , method= RequestMethod.POST)
    public MuscleDTO getMuscleDTOByMuscleName(HttpServletRequest request , HttpServletResponse response , @RequestBody MuscleDTO muscleDTO) throws Exception {
        return null;
    }
    @RequestMapping(value="/insertmuclename",method=RequestMethod.POST)
    public MuscleDTO insertMuscle(HttpServletRequest request , HttpServletResponse response , @RequestBody String muscleName) throws Exception {
        return muscleServiceImpl.insertMuscleDTO(muscleName);
    }
}
