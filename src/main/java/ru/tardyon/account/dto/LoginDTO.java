package ru.tardyon.account.dto;

import lombok.Data;

@Data
public class LoginDTO {
    private String phoneOrEmail;
    private String password;
}
