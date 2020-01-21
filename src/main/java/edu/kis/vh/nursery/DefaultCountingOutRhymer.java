package edu.kis.vh.nursery;

import edu.kis.vh.nursery.methods.IntArrayStack;
import edu.kis.vh.nursery.methods.StackInterface;

public class DefaultCountingOutRhymer  {
StackInterface intArrayStack = new IntArrayStack();

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.intArrayStack =  new IntArrayStack();
    }


    public IntArrayStack getIntArrayStack() {
        return (IntArrayStack) intArrayStack;
    }

    public void setIntArrayStack(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void setTotal(int total) {
        intArrayStack.setTotal(total);
    }



}
