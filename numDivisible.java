// JAVA code to determine if number is divisible by 5 ans 11.

import java.util.*;
public class numDivisible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("The number is divisible by both 5 and 11");
        }
        else{
            System.out.println("The number is not divisible by either 5 or 11");
        }
    sc.close();
    }
    
}
