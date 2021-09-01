package org.potehin.sort.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.potehin.common.Common;

public class InsertionTest {

    @Test
    public void sortTest() {

        Integer[] array = DataInit.getRandomIntArray(20);
        Insertion.sort(array);
        Assertions.assertTrue(Common.isSorted(array));
    }
}
