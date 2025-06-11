// JAVA code for Sum of the digits of a number 

import java.util.*;
public class sumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            int digit = num % 10;  // to add the last digit
            sum += digit;          // to find the sum by adding all digits
            num /= 10;             // to remove the last digit
        }
        System.out.println("Sum of the digits: " + sum);
    sc.close();
    }
    
}
