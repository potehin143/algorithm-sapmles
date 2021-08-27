package org.potehin.priority;

import org.junit.Assert;
import org.junit.Test;
import org.potehin.sort.util.DataInit;
import org.potehin.sort.util.Quick;

import java.util.Stack;

public class MaxPQTest {

    @Test
    public void insertionTest(){
        MaxPQ maxPQ = new MaxPQ(10);
        Integer[] array = DataInit.getRandomIntArray(20);
        for (Integer value : array){
            maxPQ.insert(value);
        }

        Quick.sort(array);
        Stack<Integer> stack = new Stack<>();
        for (Integer value: array){
            stack.push(value);
        }

        while (maxPQ.size()>0){
            Comparable maxValue = maxPQ.delMax();
            Assert.assertEquals(maxValue, stack.pop());
        }
    }
}
