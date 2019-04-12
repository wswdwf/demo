package com.dateClass.fff;
/**
 * 学习SimpleDateFormat的两种重要方法
 * 1、format()
 * 2、parse()
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        Date date = new Date(11112324L);
        System.out.println(df.format(date));  //将日期按照格式化方式改为字符串
        System.out.println("***************");
        String str = "2000,10,15";
        DateFormat dateFormat = new SimpleDateFormat("yyyy,MM,dd");
        try{
            System.out.println(dateFormat.parse(str));  //将字符串改为日期，格式不相符会抛出异常
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
