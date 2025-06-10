//JAVA program to check if the value is within the given range of 10 - 100.

import java.util.*;
public class valueInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        
        if(value >= 10 && value <=100)
        {
            System.out.println("The value is within the given range");
        }
        else{
            System.out.println("The value is out of range");
        }
    sc.close();
    } 
}
