package com.chw.shop.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.chw.shop.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements IUserService {
    @Override
    public List<User> getAllUserList() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(11);
        user.setName("chw");
        users.add(user);
        return users;
    }
}
