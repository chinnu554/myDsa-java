class reversearray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Before sorting:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        int n = arr.length;
        for(int j = 0;j<n/2;j++){
            int temp = arr[j];
            arr[n-j-1] = temp;
            arr[j] = arr[n-j-1];
        }
        System.out.println(" ");
        System.out.println("After sorting:");
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}