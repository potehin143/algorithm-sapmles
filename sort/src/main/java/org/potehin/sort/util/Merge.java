package org.potehin.sort.util;

import static org.potehin.common.Common.less;

/**
 * Класс реализует алгоритм сортировки Слиянием
 */
public class Merge {

    private Merge() {
        throw new IllegalStateException("Instancing of utility class");
    }

    @SuppressWarnings("unchecked")
    public static <T> void sort(Comparable<T>[] array) {
        Comparable<T>[] tmpArray = (Comparable<T>[]) new Comparable[array.length];
        sort(array, 0, array.length - 1, tmpArray);
    }

    private static <T> void sort(Comparable<T>[] array, int lo, int hi, Comparable<T>[] tmpArray) {

        if (hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(array, lo, mid, tmpArray);
        sort(array, mid + 1, hi, tmpArray);

        merge(array, lo, mid, hi, tmpArray);
    }


    private static <T> void merge(Comparable<T>[] array, int lo, int mid, int hi, Comparable<T>[] tmpArray) {
        int i = lo;
        int j = mid + 1;

        if (hi + 1 - lo >= 0) {
            System.arraycopy(array, lo, tmpArray, lo, hi + 1 - lo);
        }


        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = tmpArray[j++];
            } else if (j > hi) {
                array[k] = tmpArray[i++];
            } else if (less(tmpArray[j], tmpArray[i])) {
                array[k] = tmpArray[j++];
            } else {
                array[k] = tmpArray[i++];
            }
        }
    }


}
