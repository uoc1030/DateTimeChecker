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
public class DateTimeCheckerLibTest {
    
    public DateTimeCheckerLibTest() {
        
    }

    @Test
    public void testCheckDayInMonth() {
        System.out.println("CheckInMonth");
         //int month = 1;
        int month = 1;
        //int year = 2021;
        int year = 2021;
        DateTimeCheckerLib instance = new DateTimeCheckerLib();
        int expResult = 30;
        int result = instance.checkDayInMonth( month, year);
        //float result = instance.checkDayInMonth( month, year);
        assertEquals(expResult, result);
    }

    @Test
    public void testValidDate() {
        System.out.println("CheckInDate");
        int day = 31;
        int month = 2;
        int year = 2021;
        DateTimeCheckerLib instance = new DateTimeCheckerLib();
        boolean expResult = true;
        boolean result = instance.validDate(day, month, year);
        assertEquals(expResult, result);
    }
    
}
