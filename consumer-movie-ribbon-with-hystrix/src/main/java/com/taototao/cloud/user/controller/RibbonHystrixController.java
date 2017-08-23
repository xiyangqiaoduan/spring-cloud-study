package com.taototao.cloud.user.controller;

import com.taototao.cloud.user.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.taototao.cloud.user.entity.*;
/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-23 10:56
 **/
@RestController
public class RibbonHystrixController {

    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon_hystrix/{id}")
    public User findById(@PathVariable Long id){
        return this.ribbonHystrixService.findById(id);
    }


}
