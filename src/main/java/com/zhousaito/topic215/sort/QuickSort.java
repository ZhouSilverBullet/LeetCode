package com.zhousaito.topic215.sort;

/**
 * Email: zhousaito@163.com
 * Created by zhousaito 2021/2/18 23:37
 * Version: 1.0
 * Description:
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int position = partition(arr, left, right);
        sort(arr, left, position - 1);
        sort(arr, position + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i, left);
        return i;
    }

    private int partition2(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
