import java.util.*;
class Solution{
    public List<List<Integer>> threeSum(int []nums){
        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp =Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        //convert set into list
        return new ArrayList<>(st);
    }
}
public class ThreeSum {
    
    public static void main(String []args){
        int []arr={-1,0,1,2,-1,4};
        Solution obj = new Solution();
        List<List<Integer>> res= obj.threeSum(arr);
        for(List<Integer> triple: res){
            for(int num : triple){
                System.out.println(num +" ");
            }
            System.out.println();
        }
    }
}
