package springboot.registerlogindemo.service;

import springboot.registerlogindemo.dto.UserDto;
import springboot.registerlogindemo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();

}
