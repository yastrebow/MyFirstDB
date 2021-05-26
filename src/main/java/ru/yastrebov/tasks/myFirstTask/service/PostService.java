package ru.yastrebov.tasks.myFirstTask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yastrebov.tasks.myFirstTask.model.Post;
import ru.yastrebov.tasks.myFirstTask.repository.PostRepository;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post getPost(Long id) {
        return postRepository.findById(id).orElseThrow(IllegalArgumentException::new);

    }

    public Post create(Post post) {
       return postRepository.save(post);
    }

    public ArrayList<Post> getAll() {
        //  return new ArrayList<>(postRepository.findAll());}
        return (ArrayList<Post>) postRepository.findAll();
    }

    public Post update(Post post, Long id) {
     return postRepository.save(post);
    }

    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
