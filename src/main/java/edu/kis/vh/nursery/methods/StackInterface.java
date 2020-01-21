package edu.kis.vh.nursery.methods;

public interface StackInterface {
    int DEFAULT_VALUE = 0;
    
    void countIn(int in);

    int countOut();

    int getTotal();

    void setTotal(int total);

    boolean isFull();

    boolean callCheck();

    int peekaboo();
}
