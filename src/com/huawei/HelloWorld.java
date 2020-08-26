package com.huawei;

import java.util.Random;

import static java.lang.Thread.sleep;

public class HelloWorld {


    public static void main(String[] args) throws InterruptedException {

        String A = "hello world!";
        for (int j = 0; j <22 ; j++) {
            String filename = getRandomString(6);
            sleep(1000);
            System.out.println(j+"\n"+A+filename);
        }

    }

    public static String getRandomString(int length) {
        String str = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(10);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }


}
