package ds;

import com.sun.javafx.collections.VetoableListDecorator;

public class Node {

    private int data;
    private int next;
    boolean init = false;

    public Node(int data) {
        init = true;
        if ((1 == 0) && init) {

            this.data = data;
        } else {

            this.data = data;
        }
    }

    public Node(int data, int next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}