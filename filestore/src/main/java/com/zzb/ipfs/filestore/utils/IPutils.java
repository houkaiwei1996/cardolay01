//package com.zzb.ipfs.filestore.utils;
//import com.maxmind.geoip2.DatabaseReader;
//import com.maxmind.geoip2.model.CityResponse;
//
//import com.maxmind.geoip2.record.*;
//
//import java.io.File;
//
//import java.net.InetAddress;
//
//
//public class IPutils {
//    public static void main(String[] args) throws Exception{
//        File database = new File("C:\\Users\\admin\\Downloads\\GeoLite2-City_20191008");
//        DatabaseReader reader = new DatabaseReader.Builder(database).build();
//        InetAddress ipAddress = InetAddress.getByName("180.168.17.91");
//        CityResponse response = reader.city(ipAddress);
//
//        Country country = response.getCountry();
//        System.out.println(country.getIsoCode());            // 'US'
//        System.out.println(country.getName());               // 'United States'
//        System.out.println(country.getNames().get("zh-CN")); // '美国'
//
//        Subdivision subdivision = response.getMostSpecificSubdivision();
//        System.out.println(subdivision.getName());    // 'Minnesota'
//        System.out.println(subdivision.getIsoCode()); // 'MN'
//
//        City city = response.getCity();
//        System.out.println(city.getName()); // 'Minneapolis'
//        System.out.println(city.getNames().get("zh-CN")); // 'Minneapolis'
//        Postal postal = response.getPostal();
//        System.out.println(postal.getCode()); // '55455'
//        Location location = response.getLocation();
//        System.out.println(location.getLatitude());  // 44.9733
//        System.out.println(location.getLongitude()); // -93.2323
//    }
//}
