package com.sort;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/29
 * @Description: 选择排序
 * @version: 1.0
 */

import java.util.Arrays;

/**
 * 算法思想：
 *      首先，找到数组中最小的那个元素，
 *      其次，将它和数组的第一个元素交换位置（如果第一个元素就是最小元素那么它就和自己交换）。
 *      再次，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
 *      如此往复，直到将整个数组排序。
 */
public class Selection {

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};
        System.out.println("排序前--->" + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后--->" + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                min = arr[j] < arr[min] ? j : min;
            }
            // 交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
