package com.taototao.cloud.user.controller;

import com.taototao.cloud.user.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import  com.taototao.cloud.user.entity.User;
/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-22 17:43
 **/
@RestController
public class FeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = this.userFeignClient.findByIdFeign(id);
        return user;
    }


}
