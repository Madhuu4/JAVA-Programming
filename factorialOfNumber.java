// JAVA code to find the factorial of a number 

import java.util.*;
public class factorialOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=num;i++){
            fact *= i;
        }
        System.out.println("The factorial of the number " + num + " is " + fact);
    sc.close();
    }
    
}
