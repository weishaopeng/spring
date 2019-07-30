package org.pengge.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 22:31
 * Purpose
 */
@Configuration
public class JavaConfig {
    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }

    @Bean
    public UseHelloWorldService useHelloWorldService() {
        UseHelloWorldService useHelloWorldService = new UseHelloWorldService();
        useHelloWorldService.setHelloWorldService(helloWorldService());
        return useHelloWorldService;
    }

    @Bean
    public UseHelloWorldService useHelloWorldService(HelloWorldService helloWorldService) {
        UseHelloWorldService useHelloWorldService = new UseHelloWorldService();
        useHelloWorldService.setHelloWorldService(helloWorldService);
        return useHelloWorldService;
    }


}
