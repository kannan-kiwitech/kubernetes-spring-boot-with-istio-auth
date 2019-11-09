package com.examples.projects.userservice.controller;

import com.examples.projects.userservice.dao.UserServiceDAO;
import com.examples.projects.userservice.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserServiceRestController {
    @Autowired
    UserServiceDAO userServiceDAO;


    @RequestMapping(value="/users", method= RequestMethod.GET)
    public List<Users> getUsersList() {
        return userServiceDAO.getUsersList();
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String getTestUsersList() {
        return "test";
    }

    @RequestMapping(value="/users", method= RequestMethod.POST)
    public List<Users> setUsersList() {
        return userServiceDAO.getUsersList();
    }
}
