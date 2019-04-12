package com.dateClass.fff;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VisibleCalendarDemo {
    public static void main(String[] args) {
        visibleCalendar();
    }

    public static void visibleCalendar(){
        System.out.println("请输入日期（格式为：2030-2-14）");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date = df.parse(inputStr);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int day = calendar.get(Calendar.DATE);  //获取要查询的DATE
            calendar.set(Calendar.DATE,1);

            int maxDate = calendar.getActualMaximum(Calendar.DATE);  //获取所设日期中该月的天数
            System.out.println("日\t一\t二\t三\t四\t五\t六");

            //设置每月一号是星期几
            for(int i=0;i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++){
                System.out.print('\t');
            }

            for(int i=1;i<=maxDate;i++){
                if(i==day){
                    System.out.print("*");
                }
                System.out.print(i+"\t");

                int w = calendar.get(Calendar.DAY_OF_WEEK);  //该日期对应的星期
                if(w==Calendar.SATURDAY){                    //周六要换行
                    System.out.println();
                }
                calendar.add(Calendar.DATE,1);      //将日期加一
            }
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
