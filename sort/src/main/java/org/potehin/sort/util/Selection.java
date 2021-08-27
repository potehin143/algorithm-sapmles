package org.potehin.sort.util;

import static org.potehin.common.Common.swap;
import static org.potehin.common.Common.less;

/**
 * Класс реализует алгоритм сортировки Выбором
 */
public class Selection {
    private Selection() {
        throw new IllegalStateException("Instancing of utility class");
    }

    public static <T> void sort(Comparable<T>[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (less(array[j], array[min])) {
                    min = j;

                }
            }
            swap(array, i, min);
        }

    }
}
