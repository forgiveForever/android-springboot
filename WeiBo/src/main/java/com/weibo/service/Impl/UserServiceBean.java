package com.weibo.service.Impl;

import com.weibo.dao.UserDao;
import com.weibo.entity.User;
import com.weibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceBean implements UserService {

   @Autowired private UserDao userDao;


    @Override
    public User editUser(User user) {
        Long row=userDao.editUser(user);
        System.out.println(row);
        return null;
    }

    @Override
    public Boolean login(User user) {
        Boolean flag=false;
        User loginUser=userDao.login(user);
        if(loginUser!=null){
            flag=true;
        }
        return flag;
    }

    @Override
    public User register(User user) {
       Long id= userDao.register(user);
        if(id!=null){
            return  user;
        }
        return  null;
    }
}
