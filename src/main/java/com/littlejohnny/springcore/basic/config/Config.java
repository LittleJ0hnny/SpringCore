package com.littlejohnny.springcore.basic.config;

import com.littlejohnny.springcore.basic.config2.Config2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(Config2.class)
public class Config {
}
