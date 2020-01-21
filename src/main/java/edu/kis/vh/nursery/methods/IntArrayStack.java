package edu.kis.vh.nursery.methods;

public class IntArrayStack implements StackInterface {

    private static final int INITIAL_RHYMER = -1;

    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];

    private int total = INITIAL_RHYMER;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_RHYMER;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    public int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void setTotal(int total) {
        this.total = total;
    }
}
