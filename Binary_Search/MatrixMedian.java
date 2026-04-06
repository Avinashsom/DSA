public class MatrixMedian {

    public int upperBound(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public int blackBox(int[][] mat, int mid){
        int count=0;
        for(int i=0;i<mat.length;i++){
            count += upperBound(mat[i],mid);
        }
        return count;
    }

    public int maxEl(int[][] mat, int n){
        int m= mat[0].length-1;
        int maxVal=-1;
        for(int i=0; i<n;i++){
            if(mat[i][m] > maxVal){
                maxVal=mat[i][m];
            }
        }
        return maxVal;
    }

    public int minEl(int[][] mat, int n){
        int m=0;
        int minVal=Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(mat[i][m]< minVal){
                minVal=mat[i][m];
            }
        }
        return minVal;
    }

    public int findMedian(int[][] matrix) {
      int low= minEl(matrix,matrix.length);
      int high = maxEl(matrix,matrix.length);
      int req = (matrix.length*matrix[0].length+1)/2;
      while(low<=high){
        int mid = (low+high)/2;
        int smallerEqual = blackBox(matrix,mid);
        if(smallerEqual<req) low=mid+1;
        else high=mid-1;
      }
      return low;
    }
}


//Ques--  Median in a Row Wise Sorted Matrix
//Given a 2D array matrix that is row-wise sorted. The task is to find the median of the given matrix.
/* Example 1

Input: matrix=[ [1, 4, 9], [2, 5, 6], [3, 7, 8] ] 
Output: 5
Explanation: If we find the linear sorted array, the array becomes 1 2 3 4 5 6 7 8 9. So, median = 5
*/
