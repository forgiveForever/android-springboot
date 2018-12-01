package com.weibo.service;

import com.weibo.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



public interface UserService {


    public User editUser(User user);
    public Boolean login(User user);

    public User register(User user);
}
