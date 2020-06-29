package com.sort;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/29
 * @Description: 希尔排序
 * @version: 1.0
 */

import java.util.Arrays;

/**
 * 算法思想：
 *      首先，选择一个增量序列 t1，t2，……，tk，其中 ti > tj, tk = 1。
 *      其次，按增量序列个数 k，对序列进行 k 趟排序。
 *      再次，每趟排序，根据对应的增量 ti，将待排序列分割成若干长度为 m 的子序列，
 *            分别对各子表进行直接插入排序。仅增量因子为 1 时，整个序列作为一个表来处理，
 *            表长度即为整个序列的长度。
 */
public class Shell {

    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        System.out.println("排序前--->" + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后--->" + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j - gap];
                        arr[j - gap] = temp;
                    }
                }
            }
        }
    }
}
