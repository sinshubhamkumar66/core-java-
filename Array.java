class Array {
    public static void main(String[] args) {
        int arr[];// declares  an array of integers
        arr= new int[10];//location memory of integers sie 10
        arr[0]=10;
        arr[1]=20;
        arr[2]=5;
        arr[3]=4;
        arr[4]=6;
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("element at index" +i+" " +arr[i]);
        }

        
        
    }
    
}
