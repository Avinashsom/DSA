package String;

public class largestString {
    public static String getLargestString(String []fruit){
        String lar= fruit[0];
        for(int i=0; i<fruit.length; i++){
            if(lar.compareToIgnoreCase(fruit[i]) < 0){ //.compareTo is acts as a diff A & a.s
                lar = fruit[i];
            }
        }
        return lar;
    }
    public static void main(String args[]){
        String []fruits= {"apple" , "banana", "mango", "Orange"};
        String largest= getLargestString(fruits);
        System.out.println(largest);
    }
}
