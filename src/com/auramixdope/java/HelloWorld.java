package com.auramixdope.java;

import com.auramixdope.re.Customer;

import java.util.ArrayList;

public class HelloWorld {
    
    public static final int SCORE = 34;
    
    private static final Customer CUST = new Customer();
    public static final int NUM = 23;
    public static final String XIXI = "re";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("xixi");
        for (int i = 0; i < 10; i++) {
            System.out.println("This is " + i);
        }
        int[] test = {2, 3, 4};
        for (int i : test) {
            System.out.println(i);
        }
        for (int i = 0; i < test.length; i++) {
            int i1 = test[i];
            System.out.println(i1);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        //iter测试
        for (Object o : list) {

        }

        //ifn测试
        if (list == null) {

        }
        //inn测试
        if (list != null) {

        }
    }
    //生成的模板演示1: test
    public void testUpdate(){
        //修改的测试
    }
    //生成的模板演示2: pric
    /**
     * 客户的id
     */
    private int id = 34;
    //生成的模板演示3: prsc
    /**
     * 客户的名字
     */
    private String name = "XiaoMing";
}
