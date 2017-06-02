package com.example.demo.controller;

import com.example.demo.dto.ResourceDTO;
import com.example.demo.service.ResourceService;
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
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @RequestMapping(value="/resource/url" , method = RequestMethod.POST)
    public ResourceDTO getResource(HttpServletRequest request, HttpServletResponse response , @RequestBody String url) {
        return resourceService.getResourceByUrl(url);
    }
    @RequestMapping(value="/resource/resource" , method = RequestMethod.POST)
    public ResourceDTO getResource(HttpServletRequest request, HttpServletResponse response , @RequestBody int resource) {
        return resourceService.getResourceByResource(resource);
    }
    @RequestMapping(value="/resource/insert" , method=RequestMethod.POST)
    public ResourceDTO insertResource(HttpServletRequest request, HttpServletResponse response , @RequestBody int resource) {
        return null;
    }

}
