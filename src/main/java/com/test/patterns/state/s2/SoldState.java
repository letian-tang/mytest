package com.test.patterns.state.s2;
/**
 * 机器正在出售糖果的状态 
 * @author tdy
 *
 */
public class SoldState implements State {  
    private Machine machine;  
  
    public SoldState(Machine machine) {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertQuarter() {  
        System.out.println("请稍等,我们正在出糖果!");  
    }  
  
    @Override  
    public void ejectQuarter() {  
        System.out.println("您已经转动过了摇柄!");  
    }  
  
    @Override  
    public void turnCrank() {  
        System.out.println("摇了2次，不能给你糖果了!");  
    }  
  
    @Override  
    public void dispense() {  
        machine.releaseBall();  
        if (machine.getCount() > 0) {  
            machine.setState(machine.getNoQuarterState());  
        } else {  
            System.out.println("出糖果!");  
            machine.setState(machine.getSoldOutState());  
        }  
    }  

}
