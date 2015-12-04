package com.test.patterns.state.s2;

/**
 * 机器处于无糖果状态 
 * @author tdy
 *
 */
public class SoldOutState implements State {  
    private Machine machine;  
    public SoldOutState(Machine machine) {  
        this.machine=machine;  
    }  
  
    @Override  
    public void insertQuarter() {  
        System.out.println("对不起，没有糖果了!");  
    }  
  
    @Override  
    public void ejectQuarter() {  
        System.out.println("对不起，没有糖果了!");  
    }  
  
    @Override  
    public void turnCrank() {  
        System.out.println("对不起，没有糖果了,请不要摇了.");  
        machine.setState(machine.getNoQuarterState());  
    }  
  
    @Override  
    public void dispense() {  
        System.out.println("对不起，没有糖果了!");  
    }  

}
