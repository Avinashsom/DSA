import java.util.*;
public class SecondLargest {
    public static int second(int []nums){
        Arrays.sort(nums);
        int largest=nums[nums.length-1];
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] < largest){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int []arr= {1,3,4,2,5,7,7};
        int secondno = second(arr);
        System.out.println(secondno);
    }
}
