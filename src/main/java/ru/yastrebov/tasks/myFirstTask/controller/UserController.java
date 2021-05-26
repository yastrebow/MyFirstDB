package ru.yastrebov.tasks.myFirstTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.yastrebov.tasks.myFirstTask.model.User;
import ru.yastrebov.tasks.myFirstTask.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
       return userService.getUser(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
      return userService.create(user);
    }

   @GetMapping
   public List<User> getAll() {
       return userService.getAll();
   }

   @PutMapping("/{id}")
   public User update (@RequestBody User user, @PathVariable Long id) {
        return userService.update(user, id);
   }

   @DeleteMapping("/{id}")
   public void delete(@PathVariable Long id) {
       userService.delete(id);
   }
}
