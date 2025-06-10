/* JAVA code of OOPS concept on Bank Application where,
Bank Account = class
Emma, 3000.00 = object
Savings account = inheritance
Account holder name, balance = abstraction
deposit, withdraw = polymorphism
 */

import java.util.*;
public class bankApplication {
    public static void main(String[] args){
        bankAccount savings = new;
        savingsAccount("Emma", 3000.00);
        savings.displayDetails();
        savings.deposit(3000.00);
        savings.withdraw(500.00);
        savings.displayDetails();
    }
    
}
