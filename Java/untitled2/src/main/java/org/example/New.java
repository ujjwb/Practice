package org.example;

import static java.lang.Math.floor;
import static java.lang.Math.*;

public class New {
    public static int hello(int a){
        if(a==0){
            return 0;
        }
        /*int b=0;
        for(int i=0;i<a;i++){
            b=b+i;
        }*/
        return a+hello(a-1);

    }
    public static void main(String[] args) {
        Integer p=40,q=100;
        System.out.printf("%.0f\n",floor(sqrt(q))-ceil(sqrt(p))+1);
        //System.out.println("Hello");
        System.out.println(hello(39450));

    }
}
