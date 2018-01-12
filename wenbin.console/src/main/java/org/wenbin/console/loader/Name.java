package org.wenbin.console.loader;

public class Name {
    private String instanceName;

    public Name(String name){
        this.instanceName = name;
    }

    public void DisplayToConsole(){
        System.out.println(this.instanceName);
    }
}
