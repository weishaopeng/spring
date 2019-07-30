package org.pengge.spring.configuration.conditional;

import org.pengge.spring.configuration.conditional.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 23:10
 * Purpose
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下列表命令为：" + listService.showListCmd());
    }

    public static void allBean(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        Map<String, ListService> beansOfType = context.getBeansOfType(ListService.class);
        System.out.println(beansOfType.keySet());
    }
}
