// JAVA code for multiplication of number 

import java.util.*;
public class mutilplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println("enter maximum table");
        int y = sc.nextInt();

        System.out.println("Multiplication table of " + num);

        for(int i=1;i<=y;i++){
            System.out.println(num + " * " + i + " = " +(num*i));
        }
        sc.close();
    }
    
}
