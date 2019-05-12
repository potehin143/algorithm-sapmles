package org.potehin.sort.util;

/**
 * Общие функции
 */
public class Common {

    private Common() {
        throw new IllegalStateException("Instancing of utility class");
    }

    /**
     * Вспомогательный метод, который меняет местами
     * элементы, которые находятся в ячейках index1, index2
     *
     * @param array     входной массив
     * @param index1    - индекс в массиве первого элемента
     * @param index2    - индекс в массиве второго элемента
     * @param &lt;T&gt; Тип данных массива
     */
    public static <T> void exchange(Comparable<T>[] array, int index1, int index2) {
        Comparable<T> tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    /**
     * Вспомогательный метод, который сравнивает
     * между собой значения value1 и value2
     *
     * @param value1    первый элемент сравнения
     * @param value2    второй элемент сравнения
     * @param &lt;T&gt; тип данных массива
     * @return true если value1 меньше value2
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean less(Comparable<T> value1, Comparable<T> value2) {
        return value1.compareTo((T) value2) < 0;
    }


    /**
     * Метод проверяет, является ли массив отсортированным
     *
     * @param array     проверяемый массив
     * @param &lt;T&gt; тип данных массива
     * @return
     */
    public static <T> boolean isSorted(Comparable<T>[] array) {
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }


}
