package com.example.fashionblog_api.services;

import com.example.fashionblog_api.dto.AdminDto;
import com.example.fashionblog_api.dto.PostDto;
import com.example.fashionblog_api.dto.UpdatePost;
import com.example.fashionblog_api.models.Comments;
import com.example.fashionblog_api.models.Likes;

import java.util.List;

public interface AdminService {

    String login(AdminDto adminDto);

    String postProduct(PostDto postDto);

    String deleteProduct(Long id);

    String updateProduct(UpdatePost updatePost, Long id);

    List<Comments> getAllComments();

    List<Likes> getAllLikes();
}
