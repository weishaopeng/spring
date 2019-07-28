package org.pengge.spring.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shaopeng.wei
 * @since 2019-07-28 21:17
 * Purpose
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public Map<String, Object> getResult() {
        Map<String, Object> map = new HashMap<>();
        map.put("test", true);
        return map;
    }
}
