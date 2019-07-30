package org.pengge;

/**
 * @author shaopeng.wei
 * @since 2019-07-30 00:00
 * Purpose
 */
public class HelloService {
    private String msg;

    public String sayHello() {
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
