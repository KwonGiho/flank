package com.example.demo.repository;

import com.example.demo.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by kwongiho on 2017. 5. 21..
 */

public interface UserRepository extends JpaRepository<UserDTO,String> {
    UserDTO findByEmailAndPassword(String email,String password);
    //UserDTO findByEmail(String email);
}
