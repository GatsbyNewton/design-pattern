package edu.wzm.action.state.example;

public interface State {

    /* 投币 */
    void insertQuarter();

    /* 退币 */
    void ejectQuarter();

    /* 转动曲柄 */
    void turnCrank();

    /* 发放糖果 */
    void dispense();

    /* 补给糖果 */
    default void refill(){

    }
}
