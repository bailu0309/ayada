package com.bailu.ayada.webservice.server;

import javax.jws.WebService;

/**
 * @Author mabailu
 * @Date 2017/10/16 20:49
 * @Description
 */

@WebService
public class SayHelloImpl implements ISayHello {

    @Override
    public String sayHello(String name) {
        System.out.println("SAY:" + name);
        return "say:::" + name;
    }
}
