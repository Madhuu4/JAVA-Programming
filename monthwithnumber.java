// JAVA code of finding a month with the number 

import java.util.*;
public class monthwithnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int month = sc.nextInt();

        switch(month)
        {
        case 1:
        System.out.println("JAN");
        break;
         case 2:
        System.out.println("FEB");
        break;
        case 3:
        System.out.println("MARCH");
        break;
        case 4:
        System.out.println("APRIL");
        break;
        case 5:
        System.out.println("MAY");
        break;
        case 6:
        System.out.println("JUNE");
        break;
        case 7:
        System.out.println("JULY");
        break;
        case 8:
        System.out.println("AUGUST");
        break;
        case 9:
        System.out.println("SEP");
        break;
        case 10:
        System.out.println("OCT");
        break;
        case 11:
        System.out.println("NOV");
        break;
        case 12:
        System.out.println("DEC");
        break;

        default:
          System.out.println("WRONG MONTH NUMBER");
    }
    sc.close();
}
}





    
