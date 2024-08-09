package ru.tardyon.account.service;

import ru.tardyon.account.dto.UserListRequestDTO;
import ru.tardyon.account.dto.UserResponseDTO;
import ru.tardyon.account.model.User;

import java.util.List;

public interface UserService {

    User getUserByPhoneOrEmail(String phoneOrEmail);

    List<UserResponseDTO> getAllUsers(UserListRequestDTO requestDTO);
}
