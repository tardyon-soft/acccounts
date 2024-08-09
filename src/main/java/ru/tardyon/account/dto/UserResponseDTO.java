package ru.tardyon.account.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserResponseDTO {
    private String name;
    private Date dateOfBirth;
    private String email;
    private String phone;
}
