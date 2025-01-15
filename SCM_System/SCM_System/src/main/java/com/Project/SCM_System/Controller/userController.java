package com.Project.SCM_System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SCM_System.Model.User;
import com.Project.SCM_System.Model.userRegistrationRequest;
import com.Project.SCM_System.Service.userService;

import java.util.List;

@RestController
@RequestMapping({"/api/users"})
public class userController {
    @Autowired
    private userService userService;
    public userController(){
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User createUser =  this.userService.createUser(user);
        return ResponseEntity.ok(createUser);
    }

    @GetMapping({"/{userId}"})
    public ResponseEntity<User> getUSerById(@PathVariable String userId){
        User user = this.userService.getUserById(userId);
        return user != null? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List <User> user = this.userService.getAllUsers();
        return ResponseEntity.ok(user);
    }

    @PutMapping({"/userId"})
    public ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody User user){
        User updateUser = this.userService.updateUser(userId, user);
        return updateUser != null? ResponseEntity.ok(updateUser) : ResponseEntity.notFound().build();
    }

    @DeleteMapping({"/{userId}"})
    public ResponseEntity<User> deleteUser(@PathVariable String userId){
        this.userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody userRegistrationRequest request){
        User user = userService.registerUser(request.getEmail(), request.getfirstName());
        return ResponseEntity.ok(user);
    }
    
    
}
