package com.chw.shop.controller;

import com.chw.shop.entity.User;
import com.chw.shop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @GetMapping("/disposeUser")
    public List<User> disposeUser() {
        return orderService.disposeUser();
    }

}
