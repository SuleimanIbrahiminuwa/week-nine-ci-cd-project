package com.example.fashionblog_api.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")
public class Admin extends BaseClass{
    private String email;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admin1")
    List<Post> postList;


}
