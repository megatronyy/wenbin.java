package org.wenbin.console.loader;

public class Name {
    private String instanceName;

    public Name(String name){
        this.instanceName = name;
    }

    public void displayToConsole(){
        System.out.println(this.instanceName);
    }

    public String getData(String strName){
        this.instanceName = strName;

        return this.instanceName;
    }
}
