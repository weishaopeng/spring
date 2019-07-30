package org.pengge.spring.configuration.conditional.service;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 23:08
 * Purpose
 */
public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
