/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.testing.lab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class DateTimeCheckerFormTest {
    
    public DateTimeCheckerFormTest() {
    }

    @Test
    public void testIsNumeric() {
        System.out.println("IsNumeric");
        String isNum = "a";
        boolean expResult = false;
        boolean result = DateTimeCheckerForm.isNumeric(isNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testMain() {
        System.out.println("Main");
        String[] args = null;
        DateTimeCheckerForm.main(args);
    }
    
}
