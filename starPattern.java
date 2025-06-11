// JAVA code to print star(*) pattern in Various ways

import java.util.*;
public class starPattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // staraight line
        int n=7;
        for(int i=0;i<n;i++)
        System.out.println("* ");

        System.out.println(" \n ");

        // solid rectangle
        for(int j=0;j<5;j++){
            for(int k=0;k<5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" \n ");

        // inverted right angled triangle
        for(int l = 0;l<5;l++){
            for(int m=5;m>l;m--){
                System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println(" \n ");

        // right angled triangle(left aligned)
        for(int p=0;p<5;p++){
            for(int o=0;o<=p;o++) {
                System.out.print("*");
            }
            System.out.println( );
        }

        sc.close();
    }
}
    
