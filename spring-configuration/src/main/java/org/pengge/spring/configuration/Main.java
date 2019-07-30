package org.pengge.spring.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 22:34
 * Purpose
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseHelloWorldService useHelloWorldService = context.getBean(UseHelloWorldService.class);
        System.out.println(useHelloWorldService.SayHello("java config"));
        context.close();

    }
}
