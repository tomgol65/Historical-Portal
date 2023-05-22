package com.historic_portal.Service;


import com.historic_portal.DTO.UserDto;
import com.historic_portal.Entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}