package com.engineeringdigest.corejava.test;

public class utils {

    public static final double PI = 3.123;
    public static int min(int a,int b){
        if(a < b){
            return  a;
        }
        return b;
    }
    public static String trimAndUppercase(String str){
        if(str != null){
          return   str.trim().toUpperCase();
        }else{
            return "";
        }
    }

}
