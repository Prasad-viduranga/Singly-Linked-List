package ds;

public class Node {
    
    private int data;
    private int next;

    public Node(int data, int next) {
        this.data = data;
        this.next = next;
    }
    
    public Node(int i) {
    }

    public void add(int num) {
        setData(num);
        setNext(0);

    }

    public void add(int index, int num) {

    }

    public void remove(int index) {

    }

    public int get(int index) {
        return 0;
    }

    public void print() {

    }

    public void clear() {

    }

    public int size() {
        return 0;
    }

    public boolean contains(int num) {
        return true;
    }

    public boolean empty() {
        return true;
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