package com.assignment.Spring1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("B")
public class Bongos implements Instrument {
    public void play(){
        System.out.println("Bongos are being played.....");
    }
}
