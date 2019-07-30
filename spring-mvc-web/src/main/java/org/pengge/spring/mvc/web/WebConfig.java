package org.pengge.spring.mvc.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author shaopeng.wei
 * @since 2019-07-28 18:33
 * Purpose
 */
@Configuration
//自动扫描相关包，发现Bean
@ComponentScan("org.pengge.spring.mvc.web")
@EnableWebMvc
public class WebConfig {
    public ViewResolver initViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
