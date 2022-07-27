package com.example.fashionblog_api.dto;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDto {

    private String name;

    private String email;

    private String phoneNumber;

    private String gender;

    private String address;

    private String password;


}
