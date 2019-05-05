package org.potehin.sort;


import org.potehin.sort.util.Insertion;
import org.potehin.sort.util.Merge;
import org.potehin.sort.util.Quick;
import org.potehin.sort.util.DataInit;
import org.apache.commons.lang.time.StopWatch;
import org.potehin.sort.util.Selection;
import org.potehin.sort.util.Shell;

import java.util.function.Consumer;

public class Application {

    public static void main(String[] args) {

        int arrayLength = 100000;

        test(Quick::sort, arrayLength, "Quick");
        test(Merge::sort, arrayLength, "Merge");
        test(Shell::sort, arrayLength, "Shell");
        test(Insertion::sort, arrayLength, "Insertion");
        test(Selection::sort, arrayLength, "Selection");
    }


    private static void test(Consumer<Integer[]> sorter, int arrayLength, String algorithm) {

        StopWatch timer = new StopWatch();
        Integer[] array = DataInit.getRandomIntArray(arrayLength);
        timer.start();
        sorter.accept(array);
        timer.split();
        System.out.println(algorithm + "-" + timer.getSplitTime());
    }
}
