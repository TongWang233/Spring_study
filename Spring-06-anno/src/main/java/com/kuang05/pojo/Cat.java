package com.kuang05.pojo;

import org.springframework.stereotype.Repository;

@Repository("cat")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class Cat {
    public String name = "jerry";
}