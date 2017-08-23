package com.taototao.cloud.user.entity;

/**
 * ${DESCRIPTION}
 *
 * @author yangcb
 * @create 2017-08-23 11:31
 **/
public class User {

    private Long id;
    private String username;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
