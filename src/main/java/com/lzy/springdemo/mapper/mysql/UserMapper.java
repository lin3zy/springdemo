package com.lzy.springdemo.mapper.mysql;

import com.github.pagehelper.Page;
import com.lzy.springdemo.model.vo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    Page<User> userList();
}
