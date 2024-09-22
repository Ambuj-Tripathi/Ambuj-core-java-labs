package com.deloitte.lab3.ex2;

public class Lab3Ex2 {
    public static String getImage(String str) {
        StringBuffer sb = new StringBuffer(str);
        String mirrorImage = sb.reverse().toString();
        return str + "|" + mirrorImage;
    }

    public static void main(String[] args) {
        String input = "EARTH";
        String result = getImage(input);
        System.out.println("Mirror Image: " + result);
    }
}
