public class MajorityElement3{
    public static  int MajorityElement(int numbers[]){

        int n = numbers.length;
      
        for(int val: numbers){
            int freq=0;
           for(int el: numbers){
               if(el==val){
                freq++;
               }} 
      if(freq > n/2){
        return val;
      }
    }
 return -1;
    }
        public static void main(String arg[]){
        int numbers[]={1,6,6,4,6,};
        
            System.out.println("Mjoritey value is " +MajorityElement(numbers));

    }
}