package com.weibo.dao;


import com.weibo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "userDao")
public interface UserDao {
    public Long register(User user);
    public User login(User user);
    public Long editUser(User user);

}

