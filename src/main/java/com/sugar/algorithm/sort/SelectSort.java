package com.sugar.algorithm.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 选择排序
 * 时间复杂度为 O(n^2)
 */
public class SelectSort {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        int number = 80000;
        int[] arr = new int[number];


        for(int i = 0; i < number; i++){
            arr[i] = (int)  Math.random() * 8000000;
        }

        // 事后统计法 执行时间平均在 一秒
        System.out.println("冒泡排序算法执行开始时间：" + simpleDateFormat.format(new Date()));
        sort(arr);
        System.out.println("冒泡排序算法执行结束时间：" + simpleDateFormat.format(new Date()));

    }

    public static void sort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    minIndex = j;
                    min = arr[j];
                }
            }

            arr[minIndex] = arr[i];
            arr[i] = min;

            if(minIndex == i){
                break;
            }
        }


    }
}
