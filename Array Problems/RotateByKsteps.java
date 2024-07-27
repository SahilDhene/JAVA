// I am aware that this is not the optimal solution, 
// but I am striving to improve each day.
// Thank you, Have a good day!


public class RotateByKsteps {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        int[] newLength = Ksteps(arr,k);
        System.out.print("Array after Ksteps: ");
        for (int i = 0; i < newLength.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] Ksteps(int[] array,int k) {
        int temp;
        for(int i=0;i<k;i++){
            temp=array[0];
            for(int j=0;j<array.length-1;j++){
                array[j]=array[j+1];
            }
            array[array.length-1]=temp;

        }
        return array;
    }
}
