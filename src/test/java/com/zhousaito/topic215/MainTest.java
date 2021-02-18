package com.zhousaito.topic215;

import com.zhousaito.topic215.sort.MergeSort;
import com.zhousaito.topic215.sort.QuickSort;
import com.zhousaito.topic215.sort.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Email: zhousaito@163.com
 * Created by zhousaito 2021/2/18 23:46
 * Version: 1.0
 * Description:
 */
public class MainTest {
    @Test
    public void test() {
        int len = 1000;
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = i;
            arr2[len - i - 1] = i;
        }
        final Sort sort = new QuickSort();
        sort.sort(arr1);
        sort.sort(arr2);
        Assert.assertArrayEquals(arr1, arr2);
    }

    @Test
    public void testMerge() {
        int len = 10000;
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = i;
            arr2[len - i - 1] = i;
        }
        final Sort sort = new MergeSort();
        sort.sort(arr1);
        sort.sort(arr2);
        Assert.assertArrayEquals(arr1, arr2);
    }
}
