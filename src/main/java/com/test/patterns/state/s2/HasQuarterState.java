package com.test.patterns.state.s2;
/**
 * 机器处于有硬币，有糖果，没有摇动的状态 
 * @author tdy
 *
 */
public class HasQuarterState implements State {  
    private Machine machine;  
      
    public HasQuarterState(Machine machine){  
        this.machine=machine;  
    }  
    @Override  
    public void insertQuarter() {  
        System.out.println("请不要再投币!");  
    }  
  
    @Override  
    public void ejectQuarter() {  
        System.out.println("退回硬币!");  
        machine.setState(machine.getNoQuarterState());  
    }  
  
    @Override  
    public void turnCrank() {  
        System.out.println("摇动中 ... ");  
        machine.setState(machine.getSoldState());  
    }  
  
    @Override  
    public void dispense() {  
        System.out.println("没有出来糖果!");  
    }  

}
