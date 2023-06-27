import java.util.*;
public class Bits{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println("Enter the position");
        int pos= sc.nextInt();
        int bitMask=1<<pos;
        
        if((bitMask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was non zero");
        }
     }
}
