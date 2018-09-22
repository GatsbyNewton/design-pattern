package edu.wzm.action.state.example;

/**
 * 状态图：
 *       退币<———
 *          |   |
 *          ——>投币——>转动曲柄——>发售糖果——>售罄
 *              ^                 |
 *              |_________________|
 *
 */
public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State state = soldState;

    int count = 0;

    public GumballMachine(int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        if (numberGumballs > 0){
            count += numberGumballs;
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void refill(int numberGumballs){
        count += numberGumballs;
        System.out.println("糖果机又补充了" + numberGumballs + "个糖果。");
        state.refill();
    }

    public void releaseBall(){
        System.out.println("糖果已发放到果槽。");
        if (count > 0){
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }
}
