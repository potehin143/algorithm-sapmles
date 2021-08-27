package org.potehin.sort.util;

import org.junit.Assert;
import org.junit.Test;
import org.potehin.common.Common;


public class SelectionTest {

    @Test
    public void sortTest() {

        Integer[] array = DataInit.getRandomIntArray(20);

        Selection.sort(array);

        Assert.assertTrue(Common.isSorted(array));
    }
}
