package org.springboot.mujin.helloworld.control;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${mujin.blog.name}")
    private String blogName;


    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String Hello(){
        return "Hello" + this.blogName;
    }
}
