public class BinarySearch{
   // Binary Search in array
   public static int BinarySearch(int num[], int key){
    int start=0;
    int end= num.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(num[mid]==key){
            return mid;
        }
        if(num[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
   }
   public static void main(String args[]){
    int numbers[]= {1,2,3,5,6,36,126,212,};
    int key= 36;
    System.out.println(BinarySearch(numbers,key));
   }
}