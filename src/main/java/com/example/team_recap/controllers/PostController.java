package com.example.team_recap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    @ResponseBody
    public String allPosts(){
        return "posts index page";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String onePost(@PathVariable long id){
        return "view an individual post #" + id;
    }

    @GetMapping("/create")
    @ResponseBody
    public String postCreateForm(){
        return "view the form for creating a post";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(){
        return "create a new post";
    }
}
