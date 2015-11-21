package com.test.callback.test01;

public class TestA implements InterfaceTT {
    private TestB testB;


    public TestA() {
        this.testB = new TestB();
    }


    public void benLaDengDecide(String res) {
        System.out.println("=======" + res + "==========");
    }

    /**
     * class A调用class B的方法传入自己的对象，相当于【you call me】 
     * 这里的me指的是 testB
     */
    public void boom() {
        testB.attack(new TestA());
    }
}
