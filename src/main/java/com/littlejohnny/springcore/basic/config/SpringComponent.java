package com.littlejohnny.springcore.basic.config;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent {
    private String decsription;

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }

    public SpringComponent() {
    }
}
