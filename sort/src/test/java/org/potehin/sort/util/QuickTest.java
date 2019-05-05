package org.potehin.sort.util;


import org.junit.Assert;
import org.junit.Test;


public class QuickTest {

    @Test
    public void sortTest(){

        Integer[] array = DataInit.getRandomIntArray(20);
        Quick.sort(array);
        Assert.assertTrue(Common.isSorted(array));
    }

}
