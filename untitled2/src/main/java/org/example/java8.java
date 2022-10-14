package org.example;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface yoyo{
    public String calls(String a);
}

public class java8 {
    public static void main(String[] args) {
        String a="yoyo";
        yoyo yo=(b) ->{ System.out.println("yoyo"); return b;};
        yo.calls("yoyoyo");

        Function<String,Integer> fun=(c)->{return c.length();};
        System.out.println(fun.apply("hello"));

        Function<String,Integer> fun1=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(fun1.apply("hellobye"));
        new Thread(()-> System.out.println("Running")).start();
        //t1.start();
        System.out.println(Arrays.asList(1,2,3,4).stream().collect(Collectors.toMap(e->e,e->e+1)));

        Optional<Integer> naam=Optional.of(1);

        Stream<Integer> str1=Stream.of(1,2,3,4,5,6,7);
        System.out.println(IntStream.of(1,2,3,4,5,6,7).boxed().reduce(0,(e1,e2)->e1+e2));
        //System.out.println(IntStream.of(1,2,3,4,5,6,7).boxed().;
        //str1.map(e->e*2).boxed().forEach(System.out::println);
        /*IntStream
                .iterate(0,e->e<10,e->e+2)
                .findFirst()
                .ifPresentOrElse(System.out.println("Present"),System.out.printLn());
        */

    }
}
