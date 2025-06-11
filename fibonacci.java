// JAVA code to print the fibonacci series

import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci series ");

        for(int i=1;i<=n-2;i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;

        }
    sc.close();
    }
    
}
