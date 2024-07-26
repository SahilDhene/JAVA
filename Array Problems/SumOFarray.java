class SumOFarray{
    public static void main(String args[]){
        int[] arr={6,3,7,8,2,1};
        int sum=SumOfArray(arr);
        System.out.println("The sum of Array is:- "+sum);

    }
    public static int SumOfArray(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=array[i]+sum;
        }
        return sum;
    }
}
