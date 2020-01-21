package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INITIAL_RHYMER = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];

    private int total = INITIAL_RHYMER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == INITIAL_RHYMER;
    }

    boolean isFull() {
        return total == CAPACITY-1;
    }

    int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
