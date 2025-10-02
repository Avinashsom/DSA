import java.util.*;
public class LinearSearch{
    public static int linearSearch(int nums[], int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int nums[]= {2,3,5,9,12,3,0,1};
        int key= 12;
        int index= linearSearch(nums, key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: "+ index);
        }
    }
}