package ru.yastrebov.tasks.myFirstTask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.yastrebov.tasks.myFirstTask.model.User;
import ru.yastrebov.tasks.myFirstTask.repository.UserRepository;

import java.util.List;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public User create(User user) {
      return userRepository.save(user);
    }

    public List<User> getAll() {
        // return new ArrayList<User>(userRepository.findAll());}
        return userRepository.findAll();
    }

    public User update(User user, Long id) {
   return userRepository.save(user);
    }

    public void delete(Long id) { userRepository.deleteById(id); }

}
