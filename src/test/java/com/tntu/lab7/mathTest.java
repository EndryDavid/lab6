
package com.tntu.lab7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class mathTest {
    
    public mathTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 5;
        int expResult = 10;
        int result = math.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
