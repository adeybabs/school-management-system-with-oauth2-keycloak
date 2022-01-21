package com.SecurityProject.SecurityProject.service;

import com.SecurityProject.SecurityProject.models.Role;
import com.SecurityProject.SecurityProject.models.SchoolUser;

import java.util.List;

public interface UserService {
    //Method to save user in the db
    SchoolUser saveUser(SchoolUser user);

    //Method to save role
    Role saveRole(Role role);

    //Method to add a role to a user
    void addRoleToUser(String username, String roleName);

    //Method to fetch a user by username
    SchoolUser getUser(String username);

    //Method to fetch all users
    List<SchoolUser>getAllUsers();
}
