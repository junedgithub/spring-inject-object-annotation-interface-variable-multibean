package com.ty;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile{
    @Override
    public void ring() {
        System.out.println("calling from nokia mobile");
    }
}
