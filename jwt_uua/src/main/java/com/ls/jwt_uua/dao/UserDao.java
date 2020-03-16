package com.ls.jwt_uua.dao;

import com.ls.jwt_uua.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String> {

    User findByUsername(String username);
}
