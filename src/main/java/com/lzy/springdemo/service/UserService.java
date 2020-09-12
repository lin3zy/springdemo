package com.lzy.springdemo.service;

import com.github.pagehelper.PageInfo;
import com.lzy.springdemo.model.vo.User;

public interface UserService {
    PageInfo<User> userList(Integer pageNum, Integer pageSize);
}
