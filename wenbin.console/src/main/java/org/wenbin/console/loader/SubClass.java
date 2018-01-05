package org.wenbin.console.loader;

/**
 * Created by quwb on 2018/1/4.
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init");
    }

    static int a;

    public SubClass() {
        System.out.println("init SubClass");
    }
}
