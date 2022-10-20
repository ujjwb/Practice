package com.assignment.boot2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    Logger logger= LoggerFactory.getLogger("Logger");

    @RequestMapping("/Hello-World")
    public void sayIt(){
        logger.info("Hello World Called");
    }
    @GetMapping("/Hello-World")
    public String sayItBack(){
        return "Hello World";
    }
    @GetMapping("/gimme-bean")
    public aBean giveit(){
        return new aBean(1,"Hello World");
    }
    @GetMapping("/gimme-bean/{id}/{name}")
    public aBean giveWithId(@PathVariable int id,@PathVariable String name){
        return new aBean(id,name);
    }


}
