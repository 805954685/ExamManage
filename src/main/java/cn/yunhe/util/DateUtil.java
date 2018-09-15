package cn.yunhe.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final String DATE_TIME_TYPE = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_TYPE = "yyyy-MM-dd";
    private static final String TIME_TYPE = "HH:mm:ss";

    public static String DateTime2String(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_TYPE);
        return sdf.format(date);
    }

    public static String Date2String(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_TYPE);
        return sdf.format(date);
    }

    public static String Time2String(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(TIME_TYPE);
        return sdf.format(date);
    }

    public static Date String2DateTime(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_TYPE);
        return sdf.parse(str);
    }

    public static Date String2Date(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_TYPE);
        return sdf.parse(str);
    }

    public static Date String2Time(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(TIME_TYPE);
        return sdf.parse(str);
    }
}
