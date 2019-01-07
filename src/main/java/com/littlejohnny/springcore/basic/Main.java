package com.littlejohnny.springcore.basic;

import com.littlejohnny.springcore.basic.config.Config;
import com.littlejohnny.springcore.basic.config2.SpringComponent3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        context.getBean(SpringComponent3.class).setDecsription("Spring Component 3");
        System.out.println(context.getBean(SpringComponent3.class).getDecsription());
    }

    /*public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        for(String element : context.getBeanDefinitionNames()) {
            System.out.println(element);
        }
    }*/

    /*public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(StandaloneClass.class);
        context.refresh();
        context.getBean(StandaloneClass.class).setDecsription("щиглик");
        System.out.println(context.getBean(StandaloneClass.class).getDecsription());
    }*/

    /*public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanA.class);
        context.refresh();
        context.getBean(Bean.class).doSomething();
    }*/
}
