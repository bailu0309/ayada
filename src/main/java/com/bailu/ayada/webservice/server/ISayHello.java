package com.bailu.ayada.webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ISayHello {

    @WebMethod
    String sayHello(String name);
}
