package com.ls.jwt_uua.service;

import com.ls.jwt_uua.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "user")
public interface UserService {

    @Cacheable(key = "#username")
    User findByUsername(String username);
}
