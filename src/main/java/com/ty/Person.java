package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
//    @Autowired
//    @Qualifier(value = "moto")
    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }
    @Autowired
    @Qualifier(value = "nokia")
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void use(){
        System.out.println("Person is using");
        mobile.ring();
    }
}
