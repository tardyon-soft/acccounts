package ru.tardyon.account.service.impl;

import lombok.AllArgsConstructor;
import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.tardyon.account.dto.UserListRequestDTO;
import ru.tardyon.account.dto.UserResponseDTO;
import ru.tardyon.account.model.User;
import ru.tardyon.account.service.EmailService;
import ru.tardyon.account.service.PhoneService;
import ru.tardyon.account.service.UserService;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    private PhoneService phoneService;
    private EmailService emailService;

    @Override
    public User getUserByPhoneOrEmail(String phoneOrEmail) {
        try {
            if (EmailValidator.getInstance().isValid(phoneOrEmail))
                return emailService.findByEmail(phoneOrEmail).getUser();
            return phoneService.findByPhone(phoneOrEmail).getUser();
        } catch (NullPointerException e) {
            throw new UsernameNotFoundException("User not found");
        }
    }

    @Override
    public List<UserResponseDTO> getAllUsers(UserListRequestDTO requestDTO) {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = getUserByPhoneOrEmail(username);
        if (user == null)
            throw new UsernameNotFoundException("User not found");
        return org.springframework.security.core.userdetails.User.builder()
                .username(username)
                .password(user.getPassword())
                .build();
    }


}
