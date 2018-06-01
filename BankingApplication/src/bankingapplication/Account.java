/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

/**
 * An class account forms a template for an object of bank account.
 * @author Anusha
 */
class Account {
     int balance;
    String name;
    
    /**
     * It is the constructor to initialize account name and balance 
     * The name and balance are initialized to zero at the beginning  
     */
    
   void account()
    {
       this.balance=0;
       this.name=null;
    }
}
