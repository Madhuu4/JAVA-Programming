/* consider two integers m & n, out task is to find the sum of the squares from m to n. 
if m>n return -1 or display the proper message. */

import java.util.*;
public class sumOfSquares {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first integer(m):");
    int m = sc.nextInt();
    System.out.println("Enter the second integer(n):");
    int n = sc.nextInt();
    int sum = 0;

    if(m>n){
        System.out.println(-1);
    }
    else{
        for(int i=m;i<n;i++){
            int square = i*i;
            sum += square;
        }
        System.out.println("The sum of squares from " + m + " to " + n + " is: " + sum);
    }
    sc.close();
  }
}
