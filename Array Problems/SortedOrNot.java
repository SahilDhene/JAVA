class SortedOrNot {
    public static void main(String args[]) {
        int[] arr = {1,2,3,8,4,5,7};
        boolean sorted = isArraySorted(arr);
        System.out.println("The Array is Sorted: " + sorted);
    }

    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
