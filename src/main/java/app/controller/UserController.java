package app.controller;

import app.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> btdf() {
        return Arrays.asList(
                new User("Jim"),
                new User("John"));
    }
}
