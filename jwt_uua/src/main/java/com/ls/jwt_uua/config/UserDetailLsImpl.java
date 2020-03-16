package com.ls.jwt_uua.config;

import com.ls.jwt_uua.entity.User;
import com.ls.jwt_uua.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class UserDetailLsImpl implements UserDetailsService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String flagkey = "loginFailFlag" + username;
        String value = redisTemplate.opsForValue().get(flagkey);
        Long timeRest = redisTemplate.getExpire(flagkey, TimeUnit.MINUTES);
        if (StringUtils.isNotBlank(value)) {

        }
        User user = userService.findByUsername(username);
        return new SecurityUserDetails(user);
    }
}
