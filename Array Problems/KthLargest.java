public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 4};
        int k = 2;
        int kthLargest = findKthLargest(arr, k);
        System.out.print("Kth largest element: " + kthLargest);
    }

    public static int findKthLargest(int[] array, int k) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array[k - 1];
    }
}
