package com.mmall.concurrency;

/**
 * @program: concurrency
 * @description:
 * @author: 李岳
 * @create: 2018-10-29 10:27
 **/

public class Test {

    public static void main(String[] args) {
     int a = 1;
     int b = 2;
     a++;
     b--;
      int c=  (++a)+(b--);
     System.out.println(c);
    }
}
