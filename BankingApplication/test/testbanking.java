/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing of banking application
 * @author Anusha
 */
public class testbanking {
    BANK b;
     
    public testbanking() { 
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b = new BANK();
    }
    
    @After
    public void tearDown() {
    }
  
    @Test
     public void testcreate_account() {
          assertEquals(100,b.creat_account("abcd")); 
          assertEquals(101,b.creat_account("efgh")); 
     }
     
      @Test
    public void testDeposite() {
    {
        assertEquals(5000,b.deposit(100,5000));
        assertEquals(2000,b.deposit(101,2000));
    }
    }
    
     @Test
    public void testWithdraw() {
    {    
         assertEquals(2000,b.withdraw(100,2000));
         assertEquals(500,b.withdraw(101,500));
    }
    }
    
    public void testTransfer() {
    {    

        assertEquals(1000,b.transfer(100,101,1000));
    }
    }
    
}
