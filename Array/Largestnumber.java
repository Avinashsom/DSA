public class Largestnumber{
  
  public static int GetLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<numbers.length; i++){
        if(largest < numbers[i]){
            largest= numbers[i];
        }
    }
    return largest;
}
public static void main(String args[]){
    int numbers[]= {35,2,40,0,61,22};
    System.out.println(GetLargest(numbers));
}
}