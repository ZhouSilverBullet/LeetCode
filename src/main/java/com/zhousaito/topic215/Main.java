package com.zhousaito.topic215;

import com.zhousaito.topic215.sort.MergeSort;
import com.zhousaito.topic215.sort.QuickSort;
import com.zhousaito.topic215.sort.Sort;

import java.util.Arrays;

/**
 * Email: zhousaito@163.com
 * Created by zhousaito 2021/2/18 23:29
 * Version: 1.0
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 3, 9, 8, 5, 6};
        sort(new MergeSort(), arr);
        sort(new QuickSort(), arr);
    }

    private static void sort(Sort sort, int[] arr) {
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
