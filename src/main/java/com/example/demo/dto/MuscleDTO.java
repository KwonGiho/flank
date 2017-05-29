package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by kwongiho on 2017. 5. 29..
 */
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="muscle")
@Entity
public class MuscleDTO {
    @Id
    @GeneratedValue
    @Column(name="muscle_no")
    private int muscleNo;
    @Column(name="muscle_name")
    private String muscleName;
}
