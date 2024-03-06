package Sort;



/*Incomplete*/
public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{9, 3, 1, 7, 0};
        QuickSort quickSort = new QuickSort();
        for (int b : a) {
            System.out.print(b + "  ");
        }
        System.out.println();
        quickSort.quickSort(a, 0, a.length - 1);
        for (int b : a) {
            System.out.print(b + "  ");
        }

    }


    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int left = low;
            int right = high;
            int pivot = arr[low];
            while (left < right) {
                while (pivot >= arr[left] && left <= high - 1) {
                    left++;
                }
                while (pivot < arr[right] && right >= low + 1) {
                    right--;
                }
                if (left < right) {
                    int temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                }
            }
            int temp = arr[right];
            arr[right] = arr[low];
            arr[low] = temp;
            quickSort(arr, low, left - 1);
            quickSort(arr, left + 1, high);
        }

    }
//    public void quickSort(int[] arr,int low ,int high) {
//        if (low>=high) return;
//        int left = low+1;
//        int right = high;
//        int pivot = arr[left];
//        while (left<=right){
//            if(arr[pivot]>=arr[left]){
//               int temp =  arr[pivot];
//               arr[pivot] = arr[left];
//               arr[left] = temp;
//               pivot = left;
//            }
//            left++;
//        }
//        quickSort(arr,low,pivot-1);
//        quickSort(arr,pivot+1,high);
//    }
}
