package com.cg.tourmanagement.service;

import java.util.List;

import com.cg.tourmanagement.model.User;
import com.cg.tourmanagement.model.UserDto;



public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
