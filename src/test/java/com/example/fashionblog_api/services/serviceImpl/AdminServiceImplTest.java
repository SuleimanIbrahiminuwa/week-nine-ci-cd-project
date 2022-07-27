//package com.example.fashionblog_api.services.serviceImpl;
//
//import com.example.fashionblog_api.dto.AdminDto;
//import com.example.fashionblog_api.dto.PostDto;
//import com.example.fashionblog_api.models.Admin;
//import com.example.fashionblog_api.models.Post;
//import com.example.fashionblog_api.repositories.AdminRepository;
//import com.example.fashionblog_api.repositories.PostRepository;
//import com.example.fashionblog_api.services.AdminService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class AdminServiceImplTest {
//
//
//
//
//    @Autowired
//    private AdminServiceImpl adminService;
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    @Autowired
//    private PostRepository postRepository;
//
//
//    private Post post;
//
//
//
//
//
//    @Test
//    void postProduct() {
//        PostDto postDto = new PostDto();
//        postDto.setName("rings");
//        postDto.setDescription("fashion");
//        assertEquals("Product Posted Successfully", adminService.postProduct(postDto));
//    }
//
//
//
//
//
//    @Test
//    void testLogin() {
//       AdminDto adminDto = new AdminDto(
//               "admin@gmail.com",
//               "admin"
//       );
//        assertEquals("Login Successfully", adminService.login(adminDto));
//
//    }
//}