package Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{9, 3, 1, 7, 1};
        InsertionSort selectionSort = new InsertionSort();
        for (int b : a) {
            System.out.print(b);
        }
        System.out.println();
        selectionSort.sort(a);
        for (int b : a) {
            System.out.print(b);
        }

    }

    public void sort( int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
//                   8 9 1
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
