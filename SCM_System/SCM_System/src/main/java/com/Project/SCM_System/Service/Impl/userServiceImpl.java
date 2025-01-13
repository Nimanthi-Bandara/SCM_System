package com.Project.SCM_System.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Model.User;
import com.Project.SCM_System.Repository.userRepository;
import com.Project.SCM_System.Service.userService;

import java.util.Optional;
import java.util.List;

@Service

public class userServiceImpl implements userService{
    @Autowired
    private userRepository userRepository;
    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String userId){
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(null);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User updateUser(String userId,User user){
        if (userRepository.existsById(userId)){
            user.setuserId(userId);
            return userRepository.save(user);
        }
                return null; //Throw exception
    }

    @Override
    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }
}
