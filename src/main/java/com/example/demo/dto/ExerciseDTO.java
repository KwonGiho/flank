package com.example.demo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kwongiho on 2017. 5. 30..
 */
@Data
@ToString
@Entity
@Table(name="Exercise")
public class ExerciseDTO {
    @Id
    @Column(name="exercise_code")
    private String exerciseCode;
    private int target;
    private int resource;
    @Column(name="trainer_code")
    private String trainerCode;

}