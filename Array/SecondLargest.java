import java.util.*;
public class SecondLargest {
    // public static int second(int []nums){ //Brute
    //     Arrays.sort(nums);
    //     int largest=nums[nums.length-1];
    //     for(int i = nums.length-2; i>=0; i--){
    //         if(nums[i] < largest){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }
    public static int second(int []nums){
        int Largest=nums[0];
        int seclar = -1;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] > Largest){
                seclar= Largest;
                Largest=nums[i];
            }
            else if(nums[i] < Largest && seclar < nums[i]){
                seclar= nums[i];
            }
        }
        return seclar;
    }
    public static void main(String [] args){
        int []arr= {1,3,4,2,5,7,7,0,9,8,7,9,9,9};
        int secondno = second(arr);
        System.out.println(secondno);
    }
}
