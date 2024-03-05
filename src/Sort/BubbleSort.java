package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{9, 3, 1, 7, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);
        for (int b : a) {
            System.out.println(b);
        }
        System.out.println(a);
    }
    public void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]>a[j+1]){
                    int temp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
