package com.practice;

import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        Date enDate = new Date();
        System.out.println(Calendar.MONTH);
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.add(Calendar.MONTH, -6);
        Date startDate = calendar.getTime();
        System.out.println(startDate);
        System.out.println(enDate);
    }
}
