/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santiago Gonzalez
 */
public class StackArrayListTest {
    
    /**
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int item = 2;
        int item_2 = 3;
        StackArrayList<Integer> instance = new StackArrayList<Integer>();
        instance.push(item);
        instance.push(item_2);
        int resultado = instance.pop();
        assertEquals(item_2,resultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackArrayList<Integer> instance = new StackArrayList<Integer>();
        instance.push(2);
        int expResult = 2;
        int result = (int) instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        int item = 2;
        int item_2 = 3;
        StackArrayList<Integer> instance = new StackArrayList<Integer>();
        instance.push(item);
        instance.push(item_2);
        int result = instance.peek();
        assertEquals(item_2, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        int item = 2;
        int item_2 = 3;
        StackArrayList<Integer> instance = new StackArrayList<Integer>();
        instance.push(item);
        instance.push(item_2);
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
