/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package bankingapplication;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class BANK contains different methods like creating an account,deposit,withdraw,
 * total balance,transfer money and the richest person in the bank
 * @author Anusha
 */

class BANK
{
    static ArrayList<Account> acc = new ArrayList();
    static int count=100;

 /**
  * This method creates multiple account 
  * @param account_name takes the name of the customer 
  */
  
    public static void creat_account(String account_name)
    {
        
        Account a=new Account();
        a.name=account_name;
        acc.add(a);
        System.out.println("Your account number is\n" + count++);
               
    }
    
    /**
     * This method helps us to deposit money by taking the account number of a particular user
     * @param account_no This parameter we refers to the account number taken by the user
     */
    
    public static void deposit(int account_no)
    {
          int amount;
               if(account_no<count && acc.get(account_no).name!= null)
               {
                   System.out.println("Enter the amount to deposite\n");
                   Scanner input=new Scanner(System.in);
                   amount=input.nextInt(); 
                   acc.get(account_no).balance+=amount;
               }
               else
                  System.out.println("Account not found\n");
                 
    }
    
    /**
     * This method helps us to withdraw money from a particular account
     * @param account_no This parameter we refers to the account number taken by the user 
     */
    
   public static void withdraw(int account_no)
    {
          int amount;
               if( account_no<count && acc.get(account_no).name!= null )
               {
                   System.out.println("Enter the amount to withdraw\n");
                   Scanner s1=new Scanner(System.in);
                   amount=s1.nextInt(); 
                   if(acc.get(account_no).balance>=amount)
                   {
                     acc.get(account_no).balance-=amount;
                   }
                   else
                     System.out.println("Insufficient funds\n");
               }
               else
                  System.out.println("Account not found\n");
            
    }
    
   /**
    * This method displays the total balance in a particular account of the user
    */
   
    public static void total_balance()
    { 
        int account;
        System.out.println("Enter your Account number\n");
        Scanner input=new Scanner(System.in); 
        account=input.nextInt();
        if(account<count && acc.get(account).name!=null)
        {
         System.out.println("balance:"+acc.get(account).balance);
        }
        else
         System.out.println("Account not found\n");
    }
   
    /**
     * This method helps us to transfer money from one account to another by passing their account number.
     * @param account1 This parameter refers to the account number of the account from which the money is to be transferred    
     * @param account2 This parameter refers to the account number of the account to which the money is transferred
     */
    
    public static void transfer(int account1, int account2)
    {
       int amount;
               if(account1<count && acc.get(account1).name!= null )
               {
                   System.out.println("Enter the amount to transfer\n");
                   Scanner s1=new Scanner(System.in);
                   amount=s1.nextInt(); 
                   if(acc.get(account1).balance>=amount)
                   {
                        if(account2<count && acc.get(account2).name!= null )
                           {
                             acc.get(account1).balance-=amount;
                             acc.get(account2).balance+=amount;
                           }
                        else
                             System.out.println("Account 2 not found\n");
                   }
                   else
                        System.out.println("Insufficient funds\n");
                }
               else
                      System.out.println("Account not found\n");  
    }
    
    /**
     * This method helps us to find the richest person in the bank
     * It also displays the name of the person and the balance in his/her account
     */
    
    public static void richest_person()
    {
        int max=0,accnumber=-1;
        for(int h=0; h<count; h++)
        {
            if(acc.get(h).balance>max)
                {
                    max=acc.get(h).balance;
                    accnumber=h;
                }
        }
        System.out.println("The richest person is:"+ acc.get(accnumber).name +
                "\n balance:" +acc.get(accnumber).balance);
                  
    }
    
}

public class BankingApplication {

    public static void main(String[] args) {
           
        int ch;
        int account;
        int account1,account2;
        String name;
        Scanner input = new Scanner(System.in);
        boolean quit = false;
   
        do{
        System.out.println("********WELCOME**********");
        System.out.println("1. Create Account\n 2. Deposite\n 3. Withdraw\n"
                + " 4. Total Balance\n5. Transfer amount\n 6. Richest person in the bank\n 7. Exit");
        System.out.println("Enter your choice:");
        ch=input.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter your name");
                    name=input.next();
                    BANK.creat_account(name);
                break;
                
            case 2: System.out.println("Enter the account number");
                    account =input.nextInt();
                    BANK.deposit(account);
                    System.out.println("Deposit successfull!!");
                break;
                
            case 3:
                    System.out.println("Enter the account number");
                    account =input.nextInt();
                    BANK.withdraw(account);
                    System.out.println("Withdrawal successfully!!");
                break;
                
            case 4:
                    BANK.total_balance();
                break;
                
            case 5:
                     System.out.println("Enter your Account number1\n");
                     account1=input.nextInt();
                     System.out.println("Enter your Account number2\n");
                     account2=input.nextInt();
                     BANK.transfer(account1,account2);
                break;
                
            case 6:
                    BANK.richest_person();
                break;
            case 7:
                    System.exit(0);
                break;
                
            default: System.out.println("Enter the valid choice from 1-7");
        }
       
    }while(!quit);
    }        
}
        

    
    

