public class LargestNumber2{
    public static  int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE;//-INFINITY
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
       return largest;
    }
    public static void main(String arg[]){
        int numbers[]={1,2,6,3,5};
        
            System.out.println("largest value is " +getLargest(numbers));

    }
}