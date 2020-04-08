package com.sugar.algorithm.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author serendipity
 * 冒泡排序
 * 时间复杂度为：O(n^2)
 */
public class BubbleSorting {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        int number = 80000;
        int[] arr = new int[number];

        for(int i = 0; i < number; i++){
            arr[i] = (int)(Math.random() * 8000000);
        }

        // 事后统计法 平均在 10秒
        System.out.println("冒泡排序算法执行开始时间：" + simpleDateFormat.format(new Date()));
        bubbleSort(arr);
        System.out.println("冒泡排序算法执行结束时间：" + simpleDateFormat.format(new Date()));




    }

    public static void bubbleSort(int[] arr){
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if(flag){
                // 冒泡排序优化：上一趟排序发现没有元素交换 flag 被标记为 true 跳出循环
                break;
            }
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }else {
                    flag = true;
                }
            }
        }
    }
}
