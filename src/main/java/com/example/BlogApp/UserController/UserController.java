package com.example.BlogApp.UserController;

import com.example.BlogApp.Model.User;
import com.example.BlogApp.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {
    private static final String REQUEST_SUCCESSFULL ="Request Has executed Successfully";
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public String createUser(@RequestBody User user) {

        User savedUser = userService.saveUser(user);
        // ... handle the response
        return "success";
    }
    @GetMapping("/allUsers")
    public ResponseEntity allUsers(){
        return new ResponseEntity<>(userService.allUsers(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteAllUsers")
    public ResponseEntity deleteAllUsers(){
        userService.deleteAll();
        return new ResponseEntity<>(REQUEST_SUCCESSFULL,HttpStatus.OK);
    }
}
