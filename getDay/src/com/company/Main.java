//The Calendar class is an abstract class that
// provides methods for converting between a specific instant in time and a set of calendar fields
// such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields,
// such as getting the date of the next week.
//
//You are given a date. You just need to write the method, getDay ,
// which returns the day on that date.
// To simplify your task, we have provided a portion of the code in the editor.

package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mm = in.nextInt();
        int dd = in.nextInt();
        int yy = in.nextInt();
        System.out.println(getDay(mm,dd,yy));
    }
    public static String getDay(int month, int day, int year){
        Calendar days = Calendar.getInstance();
        days.set(year,day,month);
        LocalDate dt = LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek = dt.getDayOfWeek();
        return dayOfWeek.name();
    }
}
