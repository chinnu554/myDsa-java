class count{
    public static void main(String args[]){
        int even = 0,odd = 0;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i:arr){
            if(i%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The total no of even elements are "+even+" and odd elements are "+odd);
    }
}