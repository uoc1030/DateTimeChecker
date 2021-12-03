package fu.testing.lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Van Vo
 */
public class DateTimeCheckerLib {
   
    int checkDayInMonth(int month, int year) {
        int res = 0;
        if (month <= 1 || month > 12 || year < 1000 || year >= 3000) {
            res = 0;
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                res = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                res = 30;
            } else {
                if ((year % 4 == 0 && year % 100 != 0 || year % 400 != 0)) {
                    res = 29;
                } else {
                    res = 28;
                }
            }
        }
        return res;
    }

    boolean validDate(int day, int month, int year) {
        boolean check = true;

        if (day < 0 || day > 31 || day > checkDayInMonth(month, year)) {
            check = false;
        }
        if (month <= 0 || month > 12) {
            check = false;
        }
        if (year < 1000 && year > 3000) {
            check = false;
        }
        return check;
    }
}
