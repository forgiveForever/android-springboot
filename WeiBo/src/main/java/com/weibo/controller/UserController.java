package com.weibo.controller;

import com.weibo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weibo/user")
@CrossOrigin(allowCredentials = "true")
public class UserController {
    @Autowired private UserDao userDao;


    @GetMapping("/findUser")
    public void findUser(@RequestParam("phone_id") String phone_id){

    }
}
