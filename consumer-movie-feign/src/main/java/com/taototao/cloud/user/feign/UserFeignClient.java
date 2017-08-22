package com.taototao.cloud.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.taototao.cloud.user.entity.User;
/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-22 17:41
 **/
@FeignClient(name = "provider-user")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
