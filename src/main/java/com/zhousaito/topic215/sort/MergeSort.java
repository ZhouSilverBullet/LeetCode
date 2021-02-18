package com.zhousaito.topic215.sort;

/**
 * Email: zhousaito@163.com
 * Created by zhousaito 2021/2/18 23:29
 * Version: 1.0
 * Description:
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        mergeSort(arr, left, mid, right);
    }

    private void mergeSort(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        if (temp.length > 0) {
            System.arraycopy(temp, 0, arr, left, temp.length);
        }
    }
}
