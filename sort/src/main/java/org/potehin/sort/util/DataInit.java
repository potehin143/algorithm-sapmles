package org.potehin.sort.util;

import java.util.Random;

public class DataInit {

    private DataInit() {
        throw new IllegalStateException("Instancing of utility class");
    }

    public static Integer[] getRandomIntArray(int size) {
        Random random = new Random();
        Integer[] array = new Integer[size];

        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt();
        }
        return array;
    }
}
