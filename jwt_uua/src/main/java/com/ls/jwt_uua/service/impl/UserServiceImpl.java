package com.ls.jwt_uua.service.impl;

import com.ls.jwt_uua.dao.UserDao;
import com.ls.jwt_uua.entity.User;
import com.ls.jwt_uua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
