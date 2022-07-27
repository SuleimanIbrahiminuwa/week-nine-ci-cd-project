//package com.example.fashionblog_api.services;
//import com.example.fashionblog_api.dto.CommentsDto;
//import com.example.fashionblog_api.dto.LikesDto;
//import com.example.fashionblog_api.dto.SignUpDto;
//import com.example.fashionblog_api.exceptions.UserNotFoundException;
//import com.example.fashionblog_api.repositories.CommentsRepository;
//import com.example.fashionblog_api.repositories.LikesRepository;
//import com.example.fashionblog_api.repositories.UserRepository;
//import com.example.fashionblog_api.services.serviceImpl.UserServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.servlet.http.HttpServletRequest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//@SpringBootTest
//class UserServiceTest {
//
//
//    @Mock
//    private  UserRepository userRepository;
//
//    @Mock
//    private  UserService userService;
//
//    @Mock
//    private CommentsRepository commentsRepository;
//
//    @Mock
//    private LikesRepository likesRepository;
//
//    @Mock
//    private HttpServletRequest httpServletRequest;
//
//    @Autowired
//    private UserServiceImpl userServiceImpl;
//
//
//
//
//
//
//
//
//    @Test
//    void  signUp() {
//        //Given
//        SignUpDto signUpDto = new SignUpDto();
//        signUpDto.setName("suleiman");
//        signUpDto.setEmail("ucheci@gmail.com");
//        signUpDto.setPhoneNumber("08066226824");
//        signUpDto.setAddress("edo");
//        signUpDto.setGender("male");
//        signUpDto.setPassword("12345");
//
//      assertEquals("SignUp Successfully", userServiceImpl.signUp(signUpDto));
////        assertThrows(UserAlreadyExist.class , ()-> userServiceImpl.signUp(signUpDto));
//    }
//
//
//
//    @Test
//    void login() {
//        SignUpDto signUpDto = new SignUpDto();
//        signUpDto.setEmail("saban@gmail.com");
//        signUpDto.setPassword("12345");
//        assertEquals("Login Successfully", userServiceImpl.login(signUpDto));
//    }
//
//
//
//    @Test
//    void comments() {
//        CommentsDto commentsDto = new CommentsDto();
//        commentsDto.setMessage("Nice Product");
//        assertThrows(UserNotFoundException.class, ()->userServiceImpl.comments(commentsDto));
//
//    }
//
//
//
//    @Test
//    void like() {
//        LikesDto likesDto = new LikesDto();
//        likesDto.setStatus(true);
//        assertThrows(UserNotFoundException.class,()->userServiceImpl.like(likesDto));
//    }
//
//
//
//
//}