package com.benita.user.mapper;

import com.benita.user.entity.User;
import com.benita.user.wrapper.request.UserForm;
import com.benita.user.wrapper.response.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserForm userForm) {
        User user = new User();
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setPhone(userForm.getPhone());
        user.setEmployeeId(userForm.getEmployeeId());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        return user;
    }

    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setPhone(user.getPhone());
        userDto.setEmployeeId(user.getEmployeeId());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
