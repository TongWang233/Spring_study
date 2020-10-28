package com.kuang05.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("dog")
public class Dog {
    /*2、如果提供了set方法，在set方法上添加@value(“值”);*/
    public String name;
    @Value("Bigdog")
    public void setName(String name) {
        this.name = name;
    }
}