package com.test.callback.test01;

public class TestB {

    public TestB() {
    }


    //class B在方法中回调class A的方法，相当于【i call you back】 
    public void attack(InterfaceTT bmw) {
        bmw.benLaDengDecide("success");
    }

}
