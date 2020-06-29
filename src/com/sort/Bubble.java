package com.sort;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/29
 * @Description: 冒泡排序
 * @version: 1.0
 */

import java.util.Arrays;

/**
 * 算法思想：
 *      首先，比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *      其次，对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 *      再次，针对所有的元素重复以上的步骤，除了最后一个。
 *      如此往复，直到没有任何一对数字需要比较。
 */
public class Bubble {

    public static void main(String[] args) {
        int[] arrays = {9, 5, 7, 6, 3, 4, 2, 1, 8};
        System.out.println("排序前--->" + Arrays.toString(arrays));
        sort(arrays);
        System.out.println("排序后--->" + Arrays.toString(arrays));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 有序标记，每一轮的初始值都是true
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i -1; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 因为有元素进行交换，所以不是有序的，标记变为false
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}
