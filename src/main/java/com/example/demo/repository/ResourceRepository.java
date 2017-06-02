package com.example.demo.repository;

import com.example.demo.dto.ResourceDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
public interface ResourceRepository extends JpaRepository<ResourceDTO,String> {
    ResourceDTO findByResource(int resource);
    ResourceDTO findByResourceAndUrl(int resource , String url);
    //ResourceDTO findByResourceAndUrl(ResourceDTO resourceDTO);
    ResourceDTO findByUrl(String url);
}
