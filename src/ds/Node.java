package ds;


public class Node {

    private int data;
    private int next;
    boolean init = false;

    public Node(int data) {

        this.data = data;
        this.data = data;
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