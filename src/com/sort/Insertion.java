package com.sort;

/**
 * @Author: Mr.Z
 * @Date: 2020/06/29
 * @Description: 插入排序
 * @version: 1.0
 */

import java.util.Arrays;

/**
 * 算法思想：
 *      首先，将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列，
 *      然后，从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面）
 */
public class Insertion {

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        System.out.println("排序前--->" + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后--->" + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j -1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
}
