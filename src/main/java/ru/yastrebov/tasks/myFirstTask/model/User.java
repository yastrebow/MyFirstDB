package ru.yastrebov.tasks.myFirstTask.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(name = "name")
    private String name;

    @OneToMany//(mappedBy = "users")
    @JoinColumn(name = "user_id")
    private List<Post> posts;

    public List<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public User(){
    }

    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
