package com.littlejohnny.springcore.basic.config2;

import org.springframework.stereotype.Component;

@Component
public class SomethingA implements Something {
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void doSomething() {
        System.out.println(description);
    }

    public SomethingA() {
        this.description = "description";
    }
}
