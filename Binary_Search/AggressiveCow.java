import java.util.Arrays;
class AggressiveCow {
    public boolean canWePlace(int[] arr, int dist, int cow){
        int totalCow=1; int lastCow=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-lastCow >= dist){
                totalCow++;
                lastCow=arr[i];
            }
        }
        if(totalCow>=cow) return true;
        else return false;
    }
    public int aggressiveCows(int[] nums, int k) {
      Arrays.sort(nums);
      int low=0; int high=nums[nums.length-1]-nums[0];
      int ans=-1;
      while(low<=high){
        int mid=(low+high)/2;
        if(canWePlace(nums,mid,k) == true){
            ans=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }
      }
      return high; // return ans also
    }
}
