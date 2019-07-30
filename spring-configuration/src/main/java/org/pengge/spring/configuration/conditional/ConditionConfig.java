package org.pengge.spring.configuration.conditional;

import org.pengge.spring.configuration.conditional.condition.MacCondition;
import org.pengge.spring.configuration.conditional.condition.WindowsCondition;
import org.pengge.spring.configuration.conditional.service.ListService;
import org.pengge.spring.configuration.conditional.service.MacListService;
import org.pengge.spring.configuration.conditional.service.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 23:08
 * Purpose
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(MacCondition.class)
    public ListService macListService() {
        return new MacListService();
    }

}
