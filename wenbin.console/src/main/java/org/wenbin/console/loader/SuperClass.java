package org.wenbin.console.loader;

/**
 * Created by quwb on 2018/1/4.
 */
public class SuperClass extends SSClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;

    public SuperClass(){
        System.out.println("init SuperClass");
    }
}
