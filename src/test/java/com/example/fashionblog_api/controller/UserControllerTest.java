//package com.example.fashionblog_api.controller;
//
//import com.example.fashionblog_api.dto.SignUpDto;
//import com.example.fashionblog_api.models.User;
//import com.example.fashionblog_api.services.UserService;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(UserController.class)
//class UserControllerTest {
//
//
//    private MockMvc mockMvc;
//
//
//    @MockBean
//    private UserService userService;
//
//
//
//
//    @Test
//    @Disabled
//    void userSignUp() throws Exception {
//       User user = new User();
//        SignUpDto signUpDto = new SignUpDto();
//
//        signUpDto.setName("suleiman");
//        signUpDto.setEmail("sule@gmail.com");
//        signUpDto.setAddress("edo");
//        signUpDto.setGender("male");
//        signUpDto.setPhoneNumber("08066226824");
//        signUpDto.setPassword("12345");
//
//        Mockito.when(userService.signUp(signUpDto)).thenReturn(String.valueOf(user));
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/user/signUp")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\n" +
//                                "    \"name\": \"suleiman\",\n" +
//                                "    \"email\": \"sule@gmail.com\",\n" +
//                                "    \"address\": \"edo\",\n" +
//                                "    \"gender\": \"male\",\n" +
//                                "    \"phoneNumber\": \"08066226824\",\n" +
//                                "    \"password\": \"12345\",\n" +
//
//                                "}"))
//                .andExpect(status().isOk());
//
//    }
//}