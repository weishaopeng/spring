package org.pengge.spring.configuration.conditional.service;

import org.pengge.spring.configuration.conditional.service.ListService;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 23:07
 * Purpose
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
