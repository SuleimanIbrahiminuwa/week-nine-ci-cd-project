package com.example.fashionblog_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminDto {

    private String email;
    private String password;

    public AdminDto(String email, String admin) {
    }
}
