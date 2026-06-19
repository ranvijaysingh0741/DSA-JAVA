public class SingleNumber4 {
    
    public static int singleNumber(int[] nums) {
        int ans=0;
 
        for(int val:nums){
            ans=ans^val;
           
            }
        
        return ans;
    }
     public static void main(String arg[]){
        int nums[]={1,6,1,4,6,4,2};
        
            System.out.println("Single element is " +singleNumber(nums));
     }
}

