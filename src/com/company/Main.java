package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
	    String str=sc.nextLine();
	    int len=sc.nextInt();
        replaceSpace(str,len);
    }

    }

    private static void replaceSpace(String str, int len) {
        //将字符串空格转化成%20
        //先计算字符串新的长度
        /*int index=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==' '){
                index++;
            }
        }
        int newlen=len+index*2;
        //新的字符串
        //从后向前向后移动字符串

        return null;*/
        String str1=str.replaceAll(" ","%20");
        System.out.println(str1);

    }
}
