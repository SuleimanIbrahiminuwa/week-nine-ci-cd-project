package com.example.fashionblog_api.services;

import com.example.fashionblog_api.dto.CommentsDto;
import com.example.fashionblog_api.dto.LikesDto;
import com.example.fashionblog_api.dto.SignUpDto;
import com.example.fashionblog_api.models.Post;
import com.example.fashionblog_api.models.postPage.PostPagination;
import org.springframework.data.domain.Page;

public interface UserService {

    String signUp(SignUpDto signUpDto);

    String login(SignUpDto signUpDto);

    String logout();

    String comments(CommentsDto commentsDto);

    Integer like(LikesDto likesDto);



    Page<Post> getAllPost(PostPagination postPagination);


}
