package com.springtest.learning.springlearning.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
//    @RequestMapping(method = RequestMethod.GET , path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello Worlds!!!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World!!!!");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVar(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s !!!!",name));
    }
}
