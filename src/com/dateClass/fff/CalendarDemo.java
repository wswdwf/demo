package com.dateClass.fff;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,Calendar.OCTOBER);
        c.set(Calendar.DATE,15);
        System.out.println(c);   //不对具体时刻进行设置，会默认为当前时刻（几时几分几秒）
    }
}
