
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number= ");
        int num = sc.nextInt();
        String result = (num%2==0)? "even" : "odd";
        System.out.println("The given number " + " is  = "  + result  );
        sc.close();


        
    }
    
}
