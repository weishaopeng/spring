package org.pengge.spring.boot.web;

import org.pengge.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private TestBean testBean;
    @Autowired
    private HelloService helloService;

    @RequestMapping("/test")
    public Map<String, Object> getResult() {
        Map<String, Object> map = new HashMap<>();
        map.put("test", "第一个spring boot 应用");
        return map;
    }

    @RequestMapping("/xml")
    public Map<String, Object> getXml() {
        Map<String, Object> map = new HashMap<>();
        map.put("xmlBean", testBean.getBeanName());
        return map;
    }

    @RequestMapping("/starter")
    public Map<String, Object> getFirstStarter() {
        Map<String, Object> map = new HashMap<>();
        map.put("test", helloService.getMsg());
        return map;
    }
}
