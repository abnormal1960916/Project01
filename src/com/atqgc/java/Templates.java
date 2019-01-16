package com.atqgc.java;

import com.atqgc.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QGC
 * @date 2019/1/15 - 10:07
 */

public class Templates {

    //模板六:prsf 可生成private static final
    //使用别的模块里的类 用Alt+Enter 添加一个依赖类
    private static final Customer cust = new Customer();

    //变形:psf
    public static final int num1 = 1;
    //变形：psfi
    public static final int num2 = 2;
    //变形：psfs
    public static final String nation = "china";



    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");


        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("Templates.main");
        int num1 = 10;
        System.out.println("num = " + num1);
        int num2 = 20;
        System.out.println(num2);

        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "Hanmeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object item : list) {
            System.out.println(item);
        }
        //变形：list.fori 从头到尾
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：listforr   倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }




        //增强for循环与普通for循环
        /* 1.普通数组中的使用 */
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 增强for循环
        for (int item : array) {
            System.out.println(item);
        }

        // 普通for循环
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        /* 2.二维数组中的使用 */
        int array2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 增强for循环
        for (int arr1[] : array2) {
            for (int item : arr1) {
                System.out.println(item);
            }
        }

        // 普通for循环
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }

        /* 3.List中的使用 */
        List<String> list1 = new ArrayList<String>();
        list.add("我");
        list.add("爱");
        list.add("中");
        list.add("国");

        // 增强for循环
        for (String item : list1) {
            System.out.println(item);
        }

        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }
    public void method(){
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        if (list == null) {
            
        }

        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }

}
