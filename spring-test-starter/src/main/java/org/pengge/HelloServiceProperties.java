package org.pengge;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shaopeng.wei
 * @since 2019-07-29 23:57
 * Purpose
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
