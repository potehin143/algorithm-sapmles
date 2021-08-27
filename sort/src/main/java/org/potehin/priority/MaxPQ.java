package org.potehin.priority;

import org.potehin.common.Common;

import java.util.Arrays;

import static org.potehin.common.Common.less;
import static org.potehin.common.Common.swap;


/**
 * Класс, реализующий
 * сортировку ключей по приоритету
 * с использованием пирамидального дерева
 * индекс родителя равен k/2, где k - это индекс потомка
 * @param <Key> Класс ключа
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq; // внутренний массив, хранящий ключи в виде пирамидального дерева
    private int n = 0;

    public MaxPQ(int maxN) {
        this.pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }


    public void insert(Key v) {
        if(n == pq.length -1){
            extend();
        }
        pq[++n] = v;
        swim(n);
    }

    private void extend(){
       Key[] newArray =  (Key[]) new Comparable[(pq.length -1) * 2 + 1];
       System.arraycopy(this.pq,0,newArray,0,this.pq.length);
       this.pq = newArray;
    }

    public Key delMax() {
        Key max = pq[1];
        swap(pq, 1, n--);
        pq[n + 1] = null;
        sink(1);
        return max;
    }

    private void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(pq[j], pq[j + 1])) {
                j++;
            }
            if (less(pq[k], pq[j])) {
                Common.swap(pq, k, j);
                k = j;
            } else {
                break;
            }
        }
    }

    /**
     * Всплытие
     * Метод восходящего восстановления упорядоченности
     *
     * @param k индекс нового элемента
     */
    private void swim(int k) {
        while (k > 1 && less(pq[k / 2], pq[k])) {
            swap(pq, k / 2, k);
            k = k / 2;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(pq);
    }
}
