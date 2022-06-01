import java.util.*;

public class GetBit{
    public static void main(String args[]) {
       int n  = 5;
       int positon = 2; 
       int bitMask = 1<<positon;

       if((bitMask & n) == 0){
           System.out.println("The bit is 0");
       }else{
           System.out.println("The bit is 1");
       }
    }
}