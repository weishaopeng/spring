package org.pengge.spring.configuration;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 22:30
 * Purpose
 */
public class UseHelloWorldService {
    HelloWorldService helloWorldService;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String SayHello(String word) {
        return helloWorldService.syaHello(word);
    }
}
