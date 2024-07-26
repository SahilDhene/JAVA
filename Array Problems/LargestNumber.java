class LargestNumber{
    public static void main(String args[]){
        int[] arr={3,2,4,7,6};
        int largest=Maximunnum(arr);
        System.out.println("The largest number is:- "+largest);

    }
    public static int Maximunnum(int[] array){
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
