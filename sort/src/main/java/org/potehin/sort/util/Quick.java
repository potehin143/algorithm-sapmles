package org.potehin.sort.util;

import static org.potehin.common.Common.swap;
import static org.potehin.common.Common.less;

/**
 * Класс реализует алгоритм Быстрой сортировки
 */
public class Quick {

    private Quick() {
        throw new IllegalStateException("Instancing of utility class");
    }

    public static <T> void sort (Comparable<T>[] array){
        sort(array,0,array.length-1);
    }

    private static <T> void sort(Comparable<T>[] array, int lo, int hi){
       if(hi <= lo) return;
       int j = partition(array,lo,hi);
       sort(array,lo,j-1);
       sort(array,j+1,hi);
    }

    /**
     * Вспомогательный метод который делает разбиение на
     * array[lo..i-1], array[i], array[i+1..hi]
     * @param array входной массив
     * @param lo нижняя граница
     * @param hi верхняя граница
     * @param &lt;T&gt; Тип данных массива
     * @return int i
     */
    private static <T> int partition (Comparable<T>[] array, int lo, int hi){
        int i = lo;
        int j = hi+1;
        Comparable<T> value = array[lo];
        while(true){
            while (less(array[++i],value)){
                if(i==hi) break;
            }
            while(less(value, array[--j])){
                if(j==lo) break;
            }
            if(i>=j){
                break;
            }else {
                swap(array, i, j);
            }
        }
        swap(array,lo,j);
      return j;
    }

}
