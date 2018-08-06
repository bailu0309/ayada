package com.bailu.ayada;

import com.bailu.ayada.webservice.server.SayHelloImpl;

import javax.xml.ws.Endpoint;

/**
 * @Author mabailu
 * @Date 2017/10/16 21:18
 * @Description
 */
public class Bootstrap {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/crt/hello",new SayHelloImpl());
        System.out.println("success");
    }
}
