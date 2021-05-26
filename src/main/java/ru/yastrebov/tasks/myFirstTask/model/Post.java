package ru.yastrebov.tasks.myFirstTask.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long post_id;

    @Column(name = "date")
    private Date date;

    @Column(name = "topic")
    private String topic;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() { return this.user; }

    public void setUser(User user) { this.user = user; }

    public Post() {
    }

    public Long getId() { return post_id; }

    public void setId(Long id) { this.post_id = post_id; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
