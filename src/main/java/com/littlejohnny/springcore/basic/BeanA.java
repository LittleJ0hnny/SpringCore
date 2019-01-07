package com.littlejohnny.springcore.basic;

public class BeanA implements Bean{
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void doSomething() {
        System.out.println(description);
    }

    public BeanA() {
        this.description = "description";
    }
}
