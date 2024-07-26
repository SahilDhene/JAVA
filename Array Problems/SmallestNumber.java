class SmallestNumber{
    public static void main(String args[]){
        int[] arr={3,2,4,7,6};
        int smallest=Minimunnum(arr);
        System.out.println("The smallest number is:- "+smallest);

    }
    public static int Minimunnum(int[] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
