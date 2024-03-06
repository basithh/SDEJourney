package Sort;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{9, 3, 1, 7, 1, 6, 4, 1, 9, 36, 134, 0};
        MergeSort mergeSort = new MergeSort();
        for (int b : a) {
            System.out.print(b + "  ");
        }
        System.out.println();
        mergeSort.mergeSort(a, 0, a.length - 1);
        for (int b : a) {
            System.out.print(b + "  ");
        }
    }

    public void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (high + low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}
