package com.example.demo.service;

import com.example.demo.dto.ResourceDTO;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
public interface ResourceService {
    ResourceDTO getResourceByResource(int resource);
    ResourceDTO getResourceByUrl(String url);
    ResourceDTO getResourceByResourceAndUrl(int resource , String url);

    ResourceDTO insertResourceDTO(int resource, String type , String url);
    ResourceDTO insertResourceDTO(ResourceDTO resourceDTO);


}
