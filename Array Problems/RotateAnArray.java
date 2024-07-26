class RotateAnArray {
    public static void main(String args[]) {
        int[] rotatedArray = RotateArray();
        System.out.print("The rotated array is: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] RotateArray() {
        int[] arr = { 1, 2, 3, 8, 4, 5, 7 };
        int left = 0;
        int right = arr.length - 1;
        int temp;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }
}
