// JAVA code for Calculator

import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);
        double answer;

        switch(op)
        {
        case '+':
        answer = a + b;
        System.out.println(answer);
        break;
         case '-':
        answer = a - b;
        System.out.println(answer);
        break;
        case '*':
        answer = a * b;
        System.out.println(answer);
        break;
        case '/':
        answer = a / b;
        System.out.println(answer);
        break;
        default:
          System.out.println("wrong operator");
    }
    sc.close();
}
}





    
