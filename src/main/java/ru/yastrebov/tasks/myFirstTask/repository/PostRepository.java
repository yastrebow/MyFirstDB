package ru.yastrebov.tasks.myFirstTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yastrebov.tasks.myFirstTask.model.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Long>  {
}
