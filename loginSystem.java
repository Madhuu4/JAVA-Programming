// JAVA program for login system, to check if the username and password are correct or not

import java.util.*;
public class loginSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username = "username";
        String password = "123456";
        System.out.println("Enter the username: ");
        String input_user = sc.nextLine();
        System.out.println("Enter the password: ");
        String input_pwd = sc.nextLine();

        if(input_user .equals (username) && input_pwd .equals (password) )
        {
            System.out.println("Credentials are verified");
        }
        else 
        {
            System.out.println("Credentials aren't verified, denied access");
        }
    sc.close();
    }
}
