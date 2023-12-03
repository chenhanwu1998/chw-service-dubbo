package com.chw.shop.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.chw.shop.entity.User;
import com.chw.shop.service.IOrderService;
import com.chw.shop.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Reference
    IUserService userService;


    @Override
    public List<User> disposeUser() {
        return userService.getAllUserList();
    }
}
