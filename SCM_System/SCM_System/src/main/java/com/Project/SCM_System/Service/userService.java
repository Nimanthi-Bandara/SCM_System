package com.Project.SCM_System.Service;

import com.Project.SCM_System.Model.User;

import java.util.List;

public interface userService {
    User createUser(User user);
    User getUserById(String userId);
    List<User> getAllUsers();
    User updateUser(String userId, User user);
    void deleteUser(String userId);
    User registerUser(String email, String getfirstName);
}
