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
    public String getUsersList() {
        return "records ms /users GET API working....";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String getTestUsersList() {
        return "records ms /test GET API working....";
    }

    @RequestMapping(value="/users", method= RequestMethod.POST)
    public String setUsersList() {
        return "records ms /users POST API working....";
    }
}
