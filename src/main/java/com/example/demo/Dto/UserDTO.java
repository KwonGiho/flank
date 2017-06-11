package com.example.demo.dto;

import com.example.demo.dto.user.User;
import com.example.demo.dto.user.UserRegister;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@AllArgsConstructor
@NoArgsConstructor

@ToString
@Entity
@Table(name = "user")
@Data
/**
 * This class used for register.
 * And this class can be use model class.
 *
 */
// 해당 클래스명은 멤버필드에 대한 대표 이름으로 설정해야된다
public class UserDTO implements User, Serializable ,UserRegister{
    @Id
    private String email;
    @Column(name="nickname")
    private String nickName;
    private String gender;
    private String password;

}
