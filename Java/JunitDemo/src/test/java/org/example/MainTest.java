package org.example;

//import org.example.Main;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MainTest {

    Main m=new Main();
    private int input;
    private int expected;


    public MainTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @BeforeClass
    public static void setup(){
        System.out.println("Before Class");
    }

    @Parameterized.Parameters
    public static Collection testC(){
        Integer expected[][]={{3,10},{2,9}};
        return Arrays.asList(expected);
    }

    @Test
    public void test(){
        //fail("TEST FAIL");
        assertEquals(expected,m.adds(input));
    }
/*    @Test
    public void testArray(){
        int[] n={12,3,4,1};
        int[] expected={1,3,4,12};
        Arrays.sort(n);
        //Arrays.stream(n).forEach(System.out::println);
        assertArrayEquals(expected,n);
    }
    @Test
    public void testNullArray(){
        int[] n=null;
        int[] expected={1,3,4,12};
        try{Arrays.sort(n);}
        catch(NullPointerException e){

        }
        //Arrays.stream(n).forEach(System.out::println);
        assertArrayEquals(expected,n);
    }

    @Test(expected=NullPointerException.class)
    public void testNulllArray(){
        int[] n=null;
        int[] expected={1,3,4,12};
        Arrays.sort(n);
        //Arrays.stream(n).forEach(System.out::println);
        assertArrayEquals(expected,n);
    }*/

}
