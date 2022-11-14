package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Hello implements Greeting{
    String msg;
    public Hello(){
        msg="hello";
    }
}
