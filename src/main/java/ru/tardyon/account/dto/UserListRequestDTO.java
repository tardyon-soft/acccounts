package ru.tardyon.account.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserListRequestDTO {
    private UserListFilterRequestDTO filters;
    private PaginationDTO pagination;

    public static class UserListFilterRequestDTO {
        private String name;
        private Date dateOfBirth;
        private String email;
        private String phone;
    }
    public static class PaginationDTO {

    }
}
