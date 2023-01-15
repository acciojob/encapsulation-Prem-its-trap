package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly obj = new RWOnly();
//        System.out.println(obj.name = "Prem");
//java: name has private access in com.driver.RWOnly
        obj.setName("Prem");
        System.out.println(obj.getName());
    }
}