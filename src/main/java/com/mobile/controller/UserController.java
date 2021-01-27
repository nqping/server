package com.mobile.controller;

import com.google.common.collect.ImmutableMap;
import com.mobile.domain.po.User;
import com.mobile.model.Response;
import com.mobile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @Description TODO
 * @Author nqp
 **/
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Response login(@Valid @RequestBody User user) {
        String token = userService.login(user);
        return Response.success("登陆成功", ImmutableMap.of("token", token));
    }

}
