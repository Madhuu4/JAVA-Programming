// JAVA program on Bank Application (OPPS Concept)

abstract class BankAccount{
    private   String AccountHolderName;
    private double Balance; 
     
     public BankAccount(String AccountHolderName, double Balance){
         this.AccountHolderName=AccountHolderName;
         this.Balance=Balance;
     }
     
     
     public abstract void displayDetails();
      
     public String getAccountHolderName(){
         return AccountHolderName;
     }
     
     public void setAccountHolderName(String AccountHolderName){
         this.AccountHolderName=AccountHolderName;
     }
     
     
     public double getBalance(){
         return Balance;
     }
     
     public void setBalance(double Balance){
         this.Balance = Balance;
     }
     
     public void deposit(double amount){
         if(amount>0){
             Balance += amount;
             System.out.println("Deposited amount:" + amount);
         }
         else{
             System.out.println("Deposit properly");
         }
     }
     
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance -=amount;
            System.out.println("Withdraw amount:" + amount);
        }
        else {
            System.out.println("Invalid Amount");
        }
    } 
}

class savingsAccount extends BankAccount{
    public savingsAccount(String AccountHolderName, double Balance){
        super(AccountHolderName, Balance);
    }
    @Override
    public void displayDetails(){
        System.out.println("Account Holder Name :" + getAccountHolderName());
        System.out.println("Account Balance:" + getBalance());
    }
    
}

public class bankApplication{
    public static void main(String[] args){
     BankAccount savings = new savingsAccount("Madhumitha", 3000.00);
     
     savings.displayDetails();
     
     savings.deposit(2000.00);
     savings.withdraw(500.00);
     
     savings.displayDetails();
     
        
    }
}