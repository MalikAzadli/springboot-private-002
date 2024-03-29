package app.service;

import app.entity.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private Map<Integer, User> data = new HashMap<>();

    public UserService() {
        data.put(1, new User("Jim"));
        data.put(2, new User("John"));
    }

    public Collection<User> getAll() {
        return data.values();
    }

    public User get(int id){
        return data.get(id);
    }

    public User add(String name) {
        User user = new User(name);
        data.put(data.size()+1, user);
        return data.get(data.size());
    }
}
