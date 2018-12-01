package com.weibo.controller;


import com.weibo.dao.UserDao;
import com.weibo.entity.User;
import com.weibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weibo/vaild")
@CrossOrigin(allowCredentials = "true")
public class ValidController {



   @Autowired  private UserService userService;
    @PostMapping("/Login")
    public Boolean Login(User user){

        return  userService.login(user);
    }

    @PostMapping("/Register")
    public User Register(User user){
        return  userService.register(user);
    }

    @PostMapping("/edit")
    public User edit(User user){
        return  userService.editUser(user);
    }
}
