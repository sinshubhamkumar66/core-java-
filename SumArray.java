public class SumArray {
    public static void main(String[] args) {
        int arr[]={1,5,8,5,3};
        // passing array in method sum
        sum(arr);


    }
    public static void sum(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
          //  System.out.println("sum of array is:" +sum);
        }
        System.out.println("sum of array is:" +sum);
    }
    
}
