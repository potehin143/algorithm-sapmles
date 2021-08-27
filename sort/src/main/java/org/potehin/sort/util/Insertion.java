package org.potehin.sort.util;

import static org.potehin.common.Common.swap;
import static org.potehin.common.Common.less;

/**
 * Класс реализует алгоритм сортировки вставками
 */
public class Insertion {

    private Insertion() {
        throw new IllegalStateException("Instancing of utility class");
    }

    public static <T> void sort(Comparable<T>[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                swap(array, j, j - 1);
            }
        }
    }
}
