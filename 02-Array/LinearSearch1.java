public class LinearSearch1{
    public static  int LinearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int num[]={2,4,6,8,10,12,14,16,20};
        int key=10;
        int index = LinearSearch(num,key);
        if(index==-1){
            System.out.println("Array not found");

        }else{
            System.out.println("Array is found at " + index);

        }
    }
}