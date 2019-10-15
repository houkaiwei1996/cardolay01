package com.zzb.ipfs.filestore.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date1 = new Date(l);
        String format = sdf.format(date1);
        Date parse = sdf.parse(format);
        System.out.println(format);
        System.out.println(date1);
        Date date = new Date();
        String format1 = sdf.format(date);
        Date parse1 = sdf.parse(format1);
        System.out.println(format1);
        boolean before = parse1.before(parse);
        boolean equals = format.equals(format1);
        System.out.println(equals);
        System.out.println(before);
    }
}
