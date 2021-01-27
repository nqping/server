package com.mobile.service;

import com.mobile.domain.mapper.UserMapper;
import com.mobile.domain.po.User;
import com.mobile.exception.ServerException;
import com.mobile.security.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;


/**
 * @Memo TODO
 * @Author nqp
 **/
@Slf4j
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AuthenticationManager authenticationManager;

    public String login(User user) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        } catch (AuthenticationException e) {
            throw new ServerException(e.getMessage());
        }
        return JwtTokenUtil.createToken(user.getUsername());
    }
}
