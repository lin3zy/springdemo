package com.lzy.springdemo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzy.springdemo.mapper.mysql.UserMapper;
import com.lzy.springdemo.model.vo.User;
import com.lzy.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public PageInfo<User> userList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<User> users = userMapper.userList();
        PageInfo<User> userPageInfo = new PageInfo<User>(users);
        userPageInfo.setTotal(users.getTotal());
        return userPageInfo;
    }
}
