package com.scaler.firstclass;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String sayHelloman(@PathVariable("id") String id){
        return "Hello World of id " + id;
    }
}
