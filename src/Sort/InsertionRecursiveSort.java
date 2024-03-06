package Sort;

public class InsertionRecursiveSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,5,1,5,3};
        InsertionRecursiveSort  bubbleRecursiveSort = new InsertionRecursiveSort();
        bubbleRecursiveSort.sort(arr,arr.length);

        for (int j : arr) {
            System.out.println(j);
        }
    }

    public void sort(int[] arr,int n){
        if (n==arr.length)return;
        for (int i = n; i > 0; i--) {
            if (arr[i-1]>arr[i]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        sort(arr,n+1);
    }
}
