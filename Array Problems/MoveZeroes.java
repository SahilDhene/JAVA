public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 0 };
        moveZeroesToEnd(arr);
        System.out.print("Array after moving zeroes to the end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroesToEnd(int[] array) {
        int nonZeroIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < array.length; i++) {
            array[i] = 0;
        }
    }
}
