import java.util.*;
public class Bits{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println("Enter the position");
        int pos= sc.nextInt();
        int bitMask=1<<pos;
        int newBitMask =  ~(bitMask);
        
        
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
      
     }
}
