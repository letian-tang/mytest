package com.test.patterns.state.s2;
/**
 * 机器处于没有投硬币的状态 
 * @author tdy
 *
 */
public class NoQuarterState implements State {  
    private Machine machine;  
  
    public NoQuarterState(Machine machine) {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertQuarter() {  
        System.out.println("请投币!");  
        machine.setState(machine.getHasQuarterState());  
    }  
  
    @Override  
    public void ejectQuarter() {  
        System.out.println("请投币!");  
    }  
  
    @Override  
    public void turnCrank() {  
        System.out.println("请投币!");  
    }  
  
    @Override  
    public void dispense() {  
        System.out.println("请投币!");  
    }  

}
