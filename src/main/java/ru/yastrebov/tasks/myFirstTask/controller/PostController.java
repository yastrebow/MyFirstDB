package ru.yastrebov.tasks.myFirstTask.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.yastrebov.tasks.myFirstTask.model.Post;
import ru.yastrebov.tasks.myFirstTask.service.PostService;

import java.util.ArrayList;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/{id}")
    public Post getPost(@PathVariable Long id) {
        return postService.getPost(id);

    }
    @PostMapping
    public Post create(@RequestBody Post post) {
       return postService.create(post);
    }
    @GetMapping
    public ArrayList<Post> getAll() {
        return new ArrayList<>(postService.getAll());}

    @PutMapping("/{id}")
    public Post update(@RequestBody Post post, @PathVariable Long id) {
        return postService.update(post, id); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        postService.delete(id);
    }
}

