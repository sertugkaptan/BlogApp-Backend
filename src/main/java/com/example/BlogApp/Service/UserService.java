package com.example.BlogApp.Service;

import com.example.BlogApp.Model.User;
import com.example.BlogApp.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> allUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }
    public void deleteAll(){
        userRepository.deleteAll();
    }
}
