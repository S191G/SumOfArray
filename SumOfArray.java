public class SumOfArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,7};
        int sum = 0;
        /*for(int i=0; i<a.length; i++){
            sum = sum+a[i]; 
        }*/
        
        //Enhanced for loop
        for(int value:a){
            sum = sum+ value;
        }
        System.out.println(sum);
    }
    
}
