package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Moto implements Mobile{
    @Override
    public void ring() {
        System.out.println("Calling from Moto");
    }
}
