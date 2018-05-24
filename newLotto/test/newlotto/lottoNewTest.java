/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newlotto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dawsoncamilleri
 */
public class lottoNewTest {
  
    public lottoNewTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
  
    /**
     * Test of user method, of class lottoNew.
     */
   

    /**
     * Test of openWebpage method, of class lottoNew.
     */
     @Test
    public void testUser() {
        System.out.println("user");
        String playerName = "alfred";
        lottoNew instance = new lottoNew();
        String expResult = "ALFRED";
        String result = instance.user(playerName);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void testOpenWebpage() {
        System.out.println("openWebpage");
        String urlString = "http://localhost:8084";
        String expResult = "http://localhost:8084";
        String result = lottoNew.openWebpage(urlString);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ticket method, of class lottoNew.
     */
    
    @Test
    public void testTicket() {
        System.out.println("ticket");
        double money = 3.0;
        lottoNew instance = new lottoNew();
        double expResult = 3.0;
        double result = instance.ticket(money);
        assertEquals(expResult, result, 3.0);
      
    }

    /**
     * Test of playerNumbers method, of class lottoNew.
     */
    /*
    @Test
    public void testPlayerNumbers() {
        System.out.println("playerNumbers");
        lottoNew instance = new lottoNew();
        instance.playerNumbers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lottoNumbers method, of class lottoNew.
     */
    /*
    @Test
    public void testLottoNumbers() {
        System.out.println("lottoNumbers");
        lottoNew instance = new lottoNew();
        instance.lottoNumbers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checking method, of class lottoNew.
     */
    /*
    @Test
    public void testChecking() {
        System.out.println("checking");
        lottoNew instance = new lottoNew();
        instance.checking();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of winnings method, of class lottoNew.
     */
    
    @Test
    public void testWinnings() {
        System.out.println("winnings");
        double money = 3.00;
        int same = 1;
        lottoNew instance = new lottoNew();
        double expResult = 1 * 4.25;
        double result = instance.winnings(money, same);
        assertEquals(expResult, result,0);
       
    }

    /**
     * Test of playAgain method, of class lottoNew.
     */
    
    @Test
    public void testPlayAgain() {
        System.out.println("playAgain");
        int decision = 1;
        lottoNew instance = new lottoNew();
        int expResult = 1;
        int result = instance.playAgain(decision);
        assertEquals(expResult, result);
       
    }
    @Test
    public void initialMethod() {
        System.out.println("initialMethod");
        int initialMethod = 1000;
        lottoNew instance = new lottoNew();
        int expResult = 1000;
        int result = instance.playAgain(initialMethod);
        assertEquals(expResult, result);
       
    }
    /**
     * Test of insert method, of class lottoNew.
     */
    /*
    @Test
    public void testInsert() {
        System.out.println("insert");
        lottoNew instance = new lottoNew();
        instance.insert();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class lottoNew.
     */
    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        lottoNew.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
