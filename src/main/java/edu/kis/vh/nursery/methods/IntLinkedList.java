package edu.kis.vh.nursery.methods;


public final class IntLinkedList implements StackInterface {

    private Node last;
    private int i;

    @Override
    public void countIn(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean callCheck() {
        return false;
    }

    @Override
    public int peekaboo() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();
    }

    @Override
    public int countOut() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    @Override
    public int getTotal() {
        return i;
    }

    @Override
    public void setTotal(int i) {
        this.i = i;
    }
}
