package com.taototao.cloud.user.controller;

import com.taototao.cloud.user.feign.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.taototao.cloud.user.entity.User;
/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-23 11:37
 **/
@RestController
public class FeignHystrixController {
    @Autowired
    private UserFeignHystrixClient userFeignHystrixClient;

    @GetMapping("feign-hystrix/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = this.userFeignHystrixClient.findByIdFeign(id);
        return user;
    }


}
