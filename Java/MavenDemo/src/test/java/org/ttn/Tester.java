package org.ttn;

import org.junit.Assert;
import org.junit.Test;

public class Tester {
    @Test
    public void testSum(){
        int result=new org.ttn.Main().sum(10,20);
        Assert.assertEquals(30,result);
    }
}
