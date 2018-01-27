package com.zking.crm.common;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateUtil  {

    private  static DateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String []args){
       DateUtil.testData("2017-12-28 16:57:06");
    }
    public static  void   testData(String fbrq) {
        try {
            Timestamp ts = new Timestamp(SDF.parse(fbrq).getTime());
            System.out.println(ts.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}
