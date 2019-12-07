package app.controller;

import app.entity.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Collection<User> get_all() {
        return userService.getAll();
    }

    @GetMapping("/user")
    public User get_1(@RequestParam int id){
        return userService.get(id);
    }

    @GetMapping("/user/{id}")
    public User get_2(@PathVariable("id") int id){
        return userService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/add")
    public User add(@RequestParam String name){
        return userService.add(name);
    }
}
