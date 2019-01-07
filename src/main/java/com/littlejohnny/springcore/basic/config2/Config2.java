package com.littlejohnny.springcore.basic.config2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config2 {
    @Bean
    public SpringComponent3 getComponent() {
        return new SpringComponent3();
    }
}
