package com.dateClass.fff;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateDemo {
    public static void main(String[] args) {
        demoDate();
    }

    public static void demoDate(){
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(df.format(date));
    }
}
