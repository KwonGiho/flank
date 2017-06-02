package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
@Entity
@Table(name="resource")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResourceDTO {
    @Id
    @GeneratedValue
    private int resource;
    /**
     * type have 3 types.
     * first is music
     * second is video
     * third picture
     */
    private String type;
    private String url;
}
