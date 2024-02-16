package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post("1-st post", new Date()));
        posts.add(new Post("2-nd post", new Date()));
        posts.add(new Post("3-rd post", new Date()));

        return posts;
    }
}
