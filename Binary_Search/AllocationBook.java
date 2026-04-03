import java.util.Arrays;
class AllocationBook {
    public boolean isAllocation(int []arr, int barrier, int stu){
        int allocatStu=1; int pages=0;
        for(int i=0;i<arr.length;i++){
            if(barrier<arr[i]) return false;
            else if(pages + arr[i] > barrier){
                allocatStu++;
                pages =arr[i];
            }else{
                pages +=arr[i];
            }
        }
        if(allocatStu > stu) return false;
        else return true;
    }
    public int findPages(int[] nums, int m) {
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        int low=Arrays.stream(nums).min().getAsInt();
        int high=sum;
        int res=-1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(isAllocation(nums,mid,m)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}