package com.projectems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projectems.dto.UserDTO;
@Service
public interface UserService {

    UserDTO getUserById(Long id);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(Long id, UserDTO userDTO);

    void deleteUser(Long id);

    List<UserDTO> getAllUsers();
}
