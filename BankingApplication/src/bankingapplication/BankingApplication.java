/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;
import java.util.Scanner;
class BANK
{
    int acc_no=101,acc;
    int i;
    double amount,balance=0,amt;
    String name;
    void create_account()
    {
       Scanner input = new Scanner(System.in);
       System.out.println("************Opening an account*************");
       System.out.println("Enter your name:");
       name=input.next();
       System.out.println("your Account number:"+ acc_no);
       System.out.println("Enter amount:");
       amount=input.nextDouble();
       if(amount<500)
           System.out.println("Balance should be minimum 500/-");
       else
           balance=balance+amount;
       System.out.println("Account created");
       acc_no++;
       
    }
    
    void deposit()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you account number:");
        acc=input.nextInt();
        if(acc==acc_no)
        {
            System.out.println("enter the amount to be deposited");
            amt =input.nextDouble();
            balance=balance+amount;
        }
        else
            System.out.println("Enter valid account number");
    }
    
    void withdraw()
    {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter you account number:");
        acc=input.nextInt();
        if(acc==acc_no)
        {
            System.out.println("enter the amount to be deposited");
            amt =input.nextDouble();
            balance=balance-amount;
        }
        else
            System.out.println("Enter valid account number"); 
        
    }
    
    void tranfer()
    {
        
    }
    
    void total_balance()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you account number:");
        acc=input.nextInt();
        if(acc==acc_no)
        {
            System.out.println("Balance=" + balance);
        }
        else
            System.out.println("Enter valid account number"); 
    }
    
    void richest_person()
    {
        
    }
}
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BANK b = new BANK();
        int ch;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("********WELCOME**********");
        System.out.println("1. Create Account\n 2. Deposite\n 3. Withdraw\n 4. Transfer\n 5. Total Balance\n 6. Richest Person \n 7. Exit");
        System.out.println("Enter your choice:");
        ch=input.nextInt();
        switch(ch)
        {
            case 1:b.create_account();
                break;
            case 2:b.deposit();
                break;
            case 3:b.withdraw();
                break;
            case 4:b.tranfer();
                break;
            case 5:b.total_balance();
                break;
            case 6:b.richest_person();
                break;
            case 7:System.exit(0);
        }
        }while(7);
    }
    
}
