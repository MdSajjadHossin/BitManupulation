import java.util.*;

public class UpdateBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt(); //update to 1 else update bit to 0;
        int n = 5;
        int position = 1; 
        int bitMask = 1<<position;

        if(operation == 1){
          //set
          int newNumber = bitMask | n;
          System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        

    }
}