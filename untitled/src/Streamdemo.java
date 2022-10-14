import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class yoyo{

}

public class Streamdemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        l.stream().filter(e->e>2)
                .map(e->e*2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        IntStream
                .of(1,2,3,4,5,6,7,8,9)
                .boxed();
                //.collect(Collectors.toList())

                //.forEach(System.out::println);
    }
}
