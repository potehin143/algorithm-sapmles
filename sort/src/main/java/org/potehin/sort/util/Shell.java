package org.potehin.sort.util;

import static org.potehin.sort.util.Common.exchange;
import static org.potehin.sort.util.Common.less;

/**
 * Класс реализует алгорим сортировки Шелла
 */
public class Shell {
    private Shell() {
        throw new IllegalStateException("Instancing of utility class");
    }

    public static <T> void sort(Comparable<T>[] array) {
        int h = 1;
        int n = array.length;

        while (h < n / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    exchange(array, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
