package Sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = new int[]{9, 3, 1, 7, 1};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);
        for (int b : a) {
            System.out.println(b);
        }
        System.out.println(a);
    }

    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
    }
}
