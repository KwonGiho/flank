package com.example.demo.service;

import com.example.demo.dto.ResourceDTO;
import com.example.demo.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    ResourceRepository resourceRepository;

    @Override
    public ResourceDTO getResourceByResource(int resource) {
        return resourceRepository.findByResource(resource);
    }

    @Override
    public ResourceDTO getResourceByUrl(String url) {
        return resourceRepository.findByUrl(url);
    }

    @Override
    public ResourceDTO getResourceByResourceAndUrl(int resource, String url) {
        return resourceRepository.findByResourceAndUrl(resource,url);
    }

    @Override
    public ResourceDTO insertResourceDTO(int resource, String type, String url) {
        return resourceRepository.save(new ResourceDTO(resource,type,url));
    }

    @Override
    public ResourceDTO insertResourceDTO(ResourceDTO resourceDTO) {
        return resourceRepository.save(resourceDTO);
    }
}
