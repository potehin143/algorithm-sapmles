package org.potehin.sort.util;

import org.junit.Assert;
import org.junit.Test;
import org.potehin.common.Common;

public class ShellTest {

    @Test
    public void sortTest() {

        Integer[] array = DataInit.getRandomIntArray(20);

        Shell.sort(array);

        Assert.assertTrue(Common.isSorted(array));
    }

}
