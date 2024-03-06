package Sort;

public class BubbleRecursiveSort {
    public static void main(String[] args) {
       int[] arr = new int[]{5,4,5,1,5,3};
       BubbleRecursiveSort  bubbleRecursiveSort = new BubbleRecursiveSort();
       bubbleRecursiveSort.sort(arr,arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void sort(int[] arr ,int n){
        if (n==1) return;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sort(arr,n-1);
    }
}
