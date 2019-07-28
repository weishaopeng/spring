package org.pengge.spring.mvc.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shaopeng.wei
 * @since 2019-07-28 18:42
 * Purpose
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public Map<String, Object> getTest() {
        Map<String, Object> test = new HashMap<>();
        test.put("test", true);
        return test;
    }
}
